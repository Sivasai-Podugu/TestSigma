package com.example.securitytask.config;

import com.example.securitytask.dtos.UserRegisteredDTO;
import com.example.securitytask.repositories.UserRepository;
import com.example.securitytask.services.DefaultUserService;
import com.example.securitytask.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    UserRepository userRepo;

    @Autowired
    DefaultUserService userService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {

        String redirectUrl = null;
        String username = null;
        System.out.println("Before onAuthenticationSuccess");
        if(authentication.getPrincipal() instanceof DefaultOAuth2User) {
            DefaultOAuth2User  userDetails = (DefaultOAuth2User ) authentication.getPrincipal();
            username = userDetails.getAttribute("email") !=null?userDetails.getAttribute("email"):userDetails.getAttribute("login")+"@gmail.com" ;
            System.out.println("instanceof DefaultOAuth2User");
            if(userRepo.findByEmail(username) == null) {
                System.out.println("userRepo.findByEmail(username) == null");
                UserRegisteredDTO user = new UserRegisteredDTO();
                user.setEmail_id(username);
                user.setName(userDetails.getAttribute("email") !=null?userDetails.getAttribute("email"):userDetails.getAttribute("login"));
                user.setPassword(("NoPassoword"));
                user.setRole("USER");
                userService.save(user);
            }
        }
        else{
            username =((UserDetails) authentication.getPrincipal()).getUsername();
        }
        redirectUrl = "/dashboard";
        System.out.println("Cookies before");

        Cookie[] cookies = request.getCookies();
        System.out.println("After Cookies ");
        if (cookies != null) {
            System.out.println("Cookies not empty");
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName());
                if ("BusinessJwtToken".equals(cookie.getName())) {

                    System.out.println("BusinessJwtToken");
                    // Add the cookie to the response
                    response.addCookie(cookie);
                    break;
                }
            }
        }
        else{
            System.out.println("Cookies null");
        }

        final String jwt = jwtUtil.generateToken((UserDetails) authentication.getPrincipal());
        Cookie cookie = new Cookie("BusinessJwtToken", jwt);

        cookie.setPath("/");

        cookie.setMaxAge(3600*24);

        response.addCookie(cookie);

        new DefaultRedirectStrategy().sendRedirect(request, response, redirectUrl);
    }

}
