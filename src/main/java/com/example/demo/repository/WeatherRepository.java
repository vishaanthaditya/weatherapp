package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Integer>{

}
