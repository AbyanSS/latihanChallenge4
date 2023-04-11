package com.arj.tesch4.repo;

import com.arj.tesch4.model.SeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepo extends JpaRepository<SeatEntity, Integer> {
}
