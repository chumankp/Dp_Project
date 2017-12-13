package com.bd.benz.builder;

import com.bd.api.Truck;
import com.bd.benz.impl.BenzTruck;
import com.bd.builder.TruckBuilder;

public class BenzBuilder extends TruckBuilder{

	public BenzBuilder(Integer capacity, String engineType, String fuleType) {
		super(capacity, engineType, fuleType);
	}

	@Override
	public Truck createTruck() {
		return new BenzTruck(capacity, engineType, fuleType);
	}

}
