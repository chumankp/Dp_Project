package com.fw.test;

import com.fw.channel.Channel;

public class Fw {
	public static void main(String[] args) throws InterruptedException {
		Channel channel = new Channel();
		for(int i=1; i<=2; i++) {
			Thread.sleep(100);
		channel.notify("Chuman", "Santosh", "java", "faq", "mail");
		channel.notify("Chuman", "Santosh", "java", "faq", "facebook");
		}
	}
}
