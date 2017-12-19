package com.decorator.event;

import java.util.Date;

// decorator dp class

public abstract class AdvanceEvent implements EventManager{
	protected EventManager eventmanager;

	public AdvanceEvent(EventManager eventmanager) {
		this.eventmanager = eventmanager;
	}

	@Override
	public void events(String ePlace, Date eDate, int noOfMemober) {
		this.eventmanager.events(ePlace, eDate, noOfMemober);
	}
	

}
