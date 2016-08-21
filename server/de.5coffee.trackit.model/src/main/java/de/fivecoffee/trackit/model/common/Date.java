package de.fivecoffee.trackit.model.common;

import java.util.Calendar;

public class Date {
	private Integer day;
	private Integer month;
	private Integer year;

	public Date() {
		
	}
	
	public Date(Integer day, Integer month, Integer year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
	public static Date fromJavaData(java.util.Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		return new Date(day, month, year);
	}

}
