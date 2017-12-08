package com.singleton.test;

import com.singlegton.beans.TimeStampLazy;

import som.singleton.thread.TimeZone;

public class TimeConvLazyTest {
	public static void main(String[] args) throws InterruptedException {
		
		  /*TimeStampLazy lazy = TimeStampLazy.getInstance(); 
		 TimeStampLazy lazy2 = TimeStampLazy.getInstance();
		 System.out.println("lazy = lazy2 : "+(lazy==lazy2)); 
		 */
		
		//multi threading env test
		TimeZone timeZone = new TimeZone();
		for (int i = 0; i <= 100; i++) {
			Thread t = new Thread(timeZone);
			Thread.sleep(100);
			t.start();
		}
	}
}
