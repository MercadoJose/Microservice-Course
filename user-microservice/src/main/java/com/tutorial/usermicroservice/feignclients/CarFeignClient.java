package com.tutorial.usermicroservice.feignclients;

import java.util.List;

import com.tutorial.usermicroservice.model.Car;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "car-service", url = "http://localhost:8082", path = "/cars")
public interface CarFeignClient {

    @PostMapping
    Car save(@RequestBody Car car);

    @GetMapping(value = "/byuser/{userId}")
    List<Car> getCars(@PathVariable("userId") int userId);

}
