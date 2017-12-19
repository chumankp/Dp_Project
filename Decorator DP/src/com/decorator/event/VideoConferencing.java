package com.decorator.event;

import java.util.Date;

public class VideoConferencing extends AdvanceEvent{

	public VideoConferencing(EventManager eventmanager) {
		super(eventmanager);
	}

	@Override
	public void events(String ePlace, Date eDate, int noOfMemober) {
		super.events(ePlace, eDate, noOfMemober);
		System.out.println("Adding vedio Conf... setup");
	}

}
