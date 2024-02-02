package com.test.bimbo.bimbotest.repository;

import com.test.bimbo.bimbotest.entity.PointEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointRepository extends JpaRepository<PointEntity, Integer> {
}
