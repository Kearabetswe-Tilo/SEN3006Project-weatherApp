package com.weatherApp.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;



public class DateModel {
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate searchdate;

	public LocalDate getSearchdate() {
		return searchdate;
	}

	public void setSearchdate(LocalDate searchdate) {
		this.searchdate = searchdate;
	}
	
}
