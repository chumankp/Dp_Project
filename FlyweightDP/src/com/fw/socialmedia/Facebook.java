package com.fw.socialmedia;

import com.fw.notifaction.Notifaction;

public class Facebook implements Notifaction {

	@Override
	public void publishNotifaction(String to, String from, String subject, String contant) {
		System.out.println("To :" + to + " From :" + from + " Subject :" + subject + " contant :" + contant + " By :"
				+ getClass().getSimpleName() + " With :" + hashCode());
	}

}
