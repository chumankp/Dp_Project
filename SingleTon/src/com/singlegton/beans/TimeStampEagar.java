package com.singlegton.beans;

public class TimeStampEagar {

	private static TimeStampEagar instance = new TimeStampEagar();
	
	private TimeStampEagar() {
		System.out.println("Eager instance created()");
	
	}

	public static TimeStampEagar getInstance() {
		return instance;
	}
	
}
