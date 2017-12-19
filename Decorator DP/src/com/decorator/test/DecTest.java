package com.decorator.test;

import java.util.Date;

import com.decorator.event.BusinessEvent;
import com.decorator.event.EventManager;
import com.decorator.event.VideoConferencing;

public class DecTest {
	public static void main(String[] args) {
		EventManager eventManager = new VideoConferencing(new BusinessEvent());
		eventManager.events("hyd", new Date(), 200);
	}
}
