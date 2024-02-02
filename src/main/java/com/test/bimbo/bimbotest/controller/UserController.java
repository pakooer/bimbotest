package com.test.bimbo.bimbotest.controller;

import com.test.bimbo.bimbotest.dto.UserDTO;
import com.test.bimbo.bimbotest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bimboTest/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(userService.saveUser(userDTO), HttpStatus.CREATED);
    }

    @GetMapping("/findAllUser")
    public ResponseEntity<List<UserDTO>> findAll(){
        return new ResponseEntity<>(userService.findALl(), HttpStatus.OK);
    }
}
