package com.singlegton.beans;

public class TimeStampSB {
	
	private static TimeStampSB instance;
	static {
		instance = new TimeStampSB();
	}

	private TimeStampSB() {
		System.out.println("Time Stamp object is created()");
	}

	public static TimeStampSB getInstance() {
		return instance;
	}

}
