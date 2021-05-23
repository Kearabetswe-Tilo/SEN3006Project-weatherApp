package com.weatherApp.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weatherdata")
public class WeatherModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDate weatherdate;
	private String conditions;
	private double rain;
	private int maxtemp;
	private int mintemp;
	private String sunrise;
	private String sunset;
	private String moonrise;
	private String moonset;
	private int avgwind;
	private int avghumidity;
	private int avgpressure;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getWeatherdate() {
		return weatherdate;
	}
	public void setWeatherdate(LocalDate weatherdate) {
		this.weatherdate = weatherdate;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	public double getRain() {
		return rain;
	}
	public void setRain(double rain) {
		this.rain = rain;
	}
	public int getMaxtemp() {
		return maxtemp;
	}
	public void setMaxtemp(int maxtemp) {
		this.maxtemp = maxtemp;
	}
	public int getMintemp() {
		return mintemp;
	}
	public void setMintemp(int mintemp) {
		this.mintemp = mintemp;
	}
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	public String getMoonrise() {
		return moonrise;
	}
	public void setMoonrise(String moonrise) {
		this.moonrise = moonrise;
	}
	public String getMoonset() {
		return moonset;
	}
	public void setMoonset(String moonset) {
		this.moonset = moonset;
	}
	public int getAvgwind() {
		return avgwind;
	}
	public void setAvgwind(int avgwind) {
		this.avgwind = avgwind;
	}
	public int getAvghumidity() {
		return avghumidity;
	}
	public void setAvghumidity(int avghumidity) {
		this.avghumidity = avghumidity;
	}
	public int getAvgpressure() {
		return avgpressure;
	}
	public void setAvgpressure(int avgpressure) {
		this.avgpressure = avgpressure;
	}
	
}