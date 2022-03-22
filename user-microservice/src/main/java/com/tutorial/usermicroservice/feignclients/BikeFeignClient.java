package com.tutorial.usermicroservice.feignclients;

import java.util.List;

import com.tutorial.usermicroservice.model.Bike;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "bike-service", url = "http://localhost:8083", path = "/bikes")
public interface BikeFeignClient {

    @PostMapping
    Bike save(@RequestBody Bike bike);

    @GetMapping(value = "/byuser/{userId}")
    List<Bike> getBikes(@PathVariable("userId") int userId);
}
