package com.test.bimbo.bimbotest.entity;

import com.test.bimbo.bimbotest.dto.UserDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity implements Serializable {

    @Id
    @Column(name = "id_users")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String name;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<PointEntity> points;

    public UserEntity(UserDTO userDTO) {
        this.id = userDTO.getId();
        this.name = userDTO.getName();
        this.password = userDTO.getPassword();
    }
}
