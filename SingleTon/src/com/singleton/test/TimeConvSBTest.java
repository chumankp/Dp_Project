package com.singleton.test;

public class TimeConvSBTest {

	public static void main(String[] args) throws ClassNotFoundException {
		/*TimeStampSB ts1 = TimeStampSB.getInstance();
		TimeStampSB ts2 = TimeStampSB.getInstance();
		System.out.println("ts1 :- " + ts1.hashCode() + "... ts2 " + ts2.hashCode());*/
		Class.forName("com.singlegton.beans.TimeStampSB");
	}

}
