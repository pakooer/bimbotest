package com.test.bimbo.bimbotest.service;

import com.test.bimbo.bimbotest.dto.UserDTO;
import com.test.bimbo.bimbotest.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServicesFab {

    public UserEntity createUser(UserDTO userDTO){
        return new UserEntity(userDTO);
    }

    public UserDTO createUserDTO(UserEntity userEntity){
        return new UserDTO(userEntity);
    }

    public List<UserDTO> createUsersDTO(List<UserEntity> userEntityList){
        List<UserDTO> userDTOS = new ArrayList<>();
        userEntityList.stream().forEach(
                userEntity -> {
                    userDTOS.add(createUserDTO(userEntity));
                }
        );
        return userDTOS;
    }
}
