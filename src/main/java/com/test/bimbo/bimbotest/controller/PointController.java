package com.test.bimbo.bimbotest.controller;

import com.test.bimbo.bimbotest.dto.PointDTO;
import com.test.bimbo.bimbotest.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bimboTest/points")
public class PointController {

    @Autowired
    private PointService pointService;

    @PostMapping("/savePoint")
    public ResponseEntity<PointDTO> savePoint(@RequestBody PointDTO pointDTO){
        try{
            return new ResponseEntity<>(pointService.savePoint(pointDTO), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
