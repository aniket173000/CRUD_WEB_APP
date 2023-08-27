package com.example.crud_web_app.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> listAllUsers(){
      return (List<User>) userRepository.findAll();
    }

}
