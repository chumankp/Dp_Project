package com.singleton.test;

import com.singlegton.beans.TimeStampEagar;

public class TimeConvEager {

	public static void main(String[] args) throws ClassNotFoundException {
		
		/*TimeStampEagar tse1 = TimeStampEagar.getInstance();
		TimeStampEagar tse2 = TimeStampEagar.getInstance();
		System.out.println(tse1==tse2);*/
		Class.forName("com.singlegton.beans.TimeStampEagar");
	}

}
