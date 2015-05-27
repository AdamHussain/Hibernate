package com.jsp.orm;

public class Hourly_employee extends EmployeeDto {

	private int no_of_hours_perDay;
	private double hourly_rate;

	public int getNo_of_hours_perDay() {
		return no_of_hours_perDay;
	}

	public void setNo_of_hours_perDay(int no_of_hours_perDay) {
		this.no_of_hours_perDay = no_of_hours_perDay;
	}

	public double getHourly_rate() {
		return hourly_rate;
	}

	public void setHourly_rate(double hourly_rate) {
		this.hourly_rate = hourly_rate;
	}
}
