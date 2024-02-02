package com.test.bimbo.bimbotest.entity;

import com.test.bimbo.bimbotest.dto.PointDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import jakarta.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "points")
public class PointEntity implements Serializable {

    @Id
    @Column(name = "id_points")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private UserEntity user;
    private Integer amount;

    public PointEntity(PointDTO pointDTO) {
        this.id = pointDTO.getId();
        this.user = new UserEntity(pointDTO.getUserDto());
        this.amount = pointDTO.getAmount();
    }
}
