package com.test.bimbo.bimbotest.service;

import com.test.bimbo.bimbotest.dto.PointDTO;
import com.test.bimbo.bimbotest.entity.UserEntity;
import com.test.bimbo.bimbotest.repository.PointRepository;
import com.test.bimbo.bimbotest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointService {

    @Autowired
    private PointRepository pointRepository;
    @Autowired
    private PointServiceFab serviceFab;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServicesFab userServicesFab;

    public PointDTO savePoint(PointDTO pointDTO){
        UserEntity user = userRepository.findById(pointDTO.getIdUser()).get();
        pointDTO.setUserDto(userServicesFab.createUserDTO(user));
        return serviceFab.createPointDTO(pointRepository.save(serviceFab.createPoint(pointDTO)));
    }

    public List<PointDTO> findAll(){
        return serviceFab.createPointsDTO(pointRepository.findAll());
    }
}
