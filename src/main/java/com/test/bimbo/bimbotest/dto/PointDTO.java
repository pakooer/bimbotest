package com.test.bimbo.bimbotest.dto;

import com.test.bimbo.bimbotest.entity.PointEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PointDTO {

    private Integer id;
    private UserDTO userDto;
    private Integer amount;
    private Integer idUser;

    public PointDTO(PointEntity pointEntity) {
        this.id = pointEntity.getId();
        //this.userDto = new UserDTO(pointEntity.getUserEntity());
        this.amount = pointEntity.getAmount();
    }
}
