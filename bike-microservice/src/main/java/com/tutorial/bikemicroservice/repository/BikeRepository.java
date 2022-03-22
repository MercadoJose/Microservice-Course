package com.tutorial.bikemicroservice.repository;

import java.util.List;

import com.tutorial.bikemicroservice.entity.Bike;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {

    List<Bike> findByUserId(int userId);
}
