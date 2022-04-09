package com.example.spring.with.mvc.service;

import com.example.spring.with.mvc.model.User;
import com.example.spring.with.mvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String saveUser(User user){
        User save = userRepository.save(user);
        if(save.getUserId()>0)
            return "Saved user details successfully";
        else
            return "Failed to save records";
    }

}
