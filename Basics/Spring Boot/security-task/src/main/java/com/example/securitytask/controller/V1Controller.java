package com.example.securitytask.controller;


import com.example.securitytask.dtos.UserLoginDTO;
import com.example.securitytask.models.User;
import com.example.securitytask.repositories.UserRepository;
import com.example.securitytask.services.DefaultUserService;
import com.example.securitytask.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class V1Controller {
    @Autowired
    private DefaultUserService userService;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @Autowired
    UserRepository userRepo;

    @ModelAttribute("user")
    public UserLoginDTO userLoginDTO() {
        return new UserLoginDTO();
    }

    @GetMapping("/v1")
    public String loginV1(Authentication authentication, @CookieValue("V1Jwt") String v1jwt) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        User user = userRepo.findByEmail(userDetails.getUsername());
        if(v1jwt.isEmpty()){
            return "deniedv1";
        }
        else{
            return "v1";
        }

    }

    @GetMapping("/token/v1/generate")
    public String generateToken(Authentication authentication, HttpServletResponse httpServletResponse){
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        String jwt = jwtTokenUtil.generateToken(userDetails.getUsername()+"_v1user");
        System.out.println(userDetails.getUsername());
        User user = userRepo.findByEmail(userDetails.getUsername());
        user.setApiUser(true);
        userRepo.save(user);
        Cookie cookie = new Cookie("V1Jwt", jwt);
        cookie.setPath("/");

        cookie.setMaxAge(3600*24);

        httpServletResponse.addCookie(cookie);

        return "redirect:/dashboard?success=true";




    }



}
