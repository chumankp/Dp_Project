package com.fw.notifaction.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.fw.notifaction.Notifaction;
import com.fw.socialmedia.Facebook;
import com.fw.socialmedia.Mail;

public class NotifactionFactory {
	private static NotifactionFactory instance;
	protected Notifaction notifaction;
	protected Map<String, Notifaction> map;

	public NotifactionFactory() {
		map = new ConcurrentHashMap<>();
	}

	public static NotifactionFactory getFactory() {
			synchronized (NotifactionFactory.class) {
				if (instance == null) {
					instance = new NotifactionFactory();
				}
			}
		return instance;
	}
	
	public Notifaction getNotifaction(String type) {
		if("mail".equals(type)) {
			if(map.containsKey(type)) {
				notifaction = map.get(type);
			}else {
				notifaction = new Mail();
				map.put(type, notifaction);
			}
		}else if("facebook".equals(type)) {
			if(map.containsKey(type)) {
				notifaction = map.get(type);
			}else {
				notifaction = new Facebook();
				map.put(type, notifaction);
			}
		}
		return notifaction;
		
	}
}
