package com.test.bimbo.bimbotest.dto;

import com.test.bimbo.bimbotest.entity.UserEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class UserDTO {

    private Integer id;
    private String name;
    private String password;
    private List<PointDTO> pointDTOS;

    public UserDTO(UserEntity userEntity) {
        this.id = userEntity.getId();
        this.name = userEntity.getName();
        this.password = userEntity.getPassword();

        this.pointDTOS = new ArrayList<>();
        userEntity.getPoints().forEach(
                point -> pointDTOS.add(new PointDTO(point))
        );
    }
}
