package com.fw.channel;

import com.fw.notifaction.Notifaction;
import com.fw.notifaction.factory.NotifactionFactory;

public class Channel {
	
	public void notify(String to, String from, String subject, String contant, String type) {
		NotifactionFactory factory;
		Notifaction notifaction;
		factory = NotifactionFactory.getFactory();
		notifaction = factory.getNotifaction(type);
		
		notifaction.publishNotifaction(to, from, subject, contant);
		
	}
}
