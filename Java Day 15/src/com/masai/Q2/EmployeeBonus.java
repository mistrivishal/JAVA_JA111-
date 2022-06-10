package com.masai.Q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import com.masai.Q1.InvalidDateFormat;

public class EmployeeBonus {
	
	public static double getBonus(String joiningDate) throws InvalidAge, InvalidDateFormat {
		
		LocalDate d = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(joiningDate, dtf);
		
		if(date.isBefore(d)) {
			Period p = Period.between(date,d);
			System.out.println(p.getYears() +","+ p.getMonths() +","+ p.getDays());
			if(p.getYears()<1) {
				return 5000; 
			}
			else if(p.getYears()<2 &&p.getYears()>=1){
				return 8000;
			}
			else {
				return 10000;
			}
		}
		else if(date.isAfter(d)){
			InvalidAge ia = new InvalidAge("Age should not be in the future");
			throw ia;
		}else {
			InvalidDateFormat idf = new InvalidDateFormat("please enter the date in proper format");
			throw idf;
		}
		
	}
}
