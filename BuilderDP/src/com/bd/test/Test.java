package com.bd.test;

import com.bd.api.Truck;

public class Test {
	public static void main(String[] args) {
		System.setProperty("com.bd.builder", "com.bd.tata.builder.TataBuilder");
		Truck truck = Truck.createBuilder(1, "Havy", "desel").settyre(10).build();
		System.out.println(truck);
	}
}
