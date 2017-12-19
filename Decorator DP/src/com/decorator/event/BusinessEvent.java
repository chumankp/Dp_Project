package com.decorator.event;

import java.util.Date;

public class BusinessEvent implements EventManager{

	@Override
	public void events(String ePlace, Date eDate, int noOfMemober) {
		System.out.println(ePlace + " at .. "+eDate+" ... with "+noOfMemober);
	}

}
