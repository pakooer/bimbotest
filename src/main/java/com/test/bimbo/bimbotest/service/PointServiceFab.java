package com.test.bimbo.bimbotest.service;

import com.test.bimbo.bimbotest.dto.PointDTO;
import com.test.bimbo.bimbotest.entity.PointEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para transformar de un tipo de objeto a otro
 */
@Service
public class PointServiceFab {

    public PointEntity createPoint(PointDTO pointDTO){
        return new PointEntity(pointDTO);
    }

    public PointDTO createPointDTO(PointEntity pointEntity){
        return new PointDTO(pointEntity);
    }

    public List<PointDTO> createPointsDTO(List<PointEntity> pointEntities){
        List<PointDTO> pointDTOS = new ArrayList<>();
        pointEntities.stream().forEach(
                pointEntity -> {
                    pointDTOS.add(createPointDTO(pointEntity));
                }
        );
        return pointDTOS;
    }

}
