package com.decorator.event;

import java.util.Date;

public class LiveStreaming extends AdvanceEvent{

	public LiveStreaming(EventManager eventmanager) {
		super(eventmanager);
	}

	@Override
	public void events(String ePlace, Date eDate, int noOfMemober) {
		super.events(ePlace, eDate, noOfMemober);
		System.out.println("Ading Live Streaming ... setup");
	}
	
}
