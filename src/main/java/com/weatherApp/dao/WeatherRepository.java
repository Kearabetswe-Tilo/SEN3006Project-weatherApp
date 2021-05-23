package com.weatherApp.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.weatherApp.model.WeatherModel;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherModel, Long> {

	public WeatherModel findByWeatherdate(LocalDate date);

}
