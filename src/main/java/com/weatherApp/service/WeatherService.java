package com.weatherApp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weatherApp.dao.WeatherRepository;
import com.weatherApp.model.WeatherModel;


@Service
@Transactional
public class WeatherService {

	@Autowired
	WeatherRepository weatherRepository;

	public WeatherModel displayDailyData() {
		Random rand = new Random();
		int upperbound = 3000;
		int int_random = rand.nextInt(upperbound); 
		long id = (long)int_random;
		return weatherRepository.getOne(id);		
	}
	
	public WeatherModel findByDate(LocalDate date) {
		
		return weatherRepository.findByWeatherdate(date);
	}
	
	public List<WeatherModel> findAlldata(){
		return weatherRepository.findAll();
	}
}
