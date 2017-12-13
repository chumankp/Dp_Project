package com.bd.tata.impl;

import com.bd.api.Truck;

public class TataTruck extends Truck{

	public TataTruck(Integer capacity, String engineType, String fuleType) {
		super(capacity, engineType, fuleType);
	}

	@Override
	public int accelerator(int speed) {
		return 200;
	}

	@Override
	public String drive() {
		return "Tata Truck is Running...";
	}

}
