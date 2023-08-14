package com.example.securitytask.services;

import com.example.securitytask.dtos.UserRegisteredDTO;
import com.example.securitytask.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface DefaultUserService extends UserDetailsService {

    User save(UserRegisteredDTO userRegisteredDTO);





}