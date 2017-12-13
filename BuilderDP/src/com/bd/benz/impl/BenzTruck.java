package com.bd.benz.impl;

import com.bd.api.Truck;

public class BenzTruck extends Truck {

	public BenzTruck(Integer capacity, String engineType, String fuleType) {
		super(capacity, engineType, fuleType);
	}

	@Override
	public int accelerator(int speed) {
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	public String drive() {
		// TODO Auto-generated method stub
		return "Benz is Runing ...";
	}

}
