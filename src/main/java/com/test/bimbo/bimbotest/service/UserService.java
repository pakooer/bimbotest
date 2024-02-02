package com.test.bimbo.bimbotest.service;

import com.test.bimbo.bimbotest.dto.UserDTO;
import com.test.bimbo.bimbotest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserServicesFab servicesFab;

    @Autowired
    private UserRepository userRepository;

    public UserDTO saveUser(UserDTO userDTO){
        return servicesFab.createUserDTO(userRepository.save(servicesFab.createUser(userDTO)));
    }

    public List<UserDTO> findALl(){
        return servicesFab.createUsersDTO(userRepository.findAll());
    }

}
