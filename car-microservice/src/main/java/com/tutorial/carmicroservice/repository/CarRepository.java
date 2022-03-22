package com.tutorial.carmicroservice.repository;

import java.util.List;

import com.tutorial.carmicroservice.entity.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    List<Car> findByUserId(int userId);
}
