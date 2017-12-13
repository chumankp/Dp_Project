package com.bd.tata.builder;

import com.bd.api.Truck;
import com.bd.builder.TruckBuilder;
import com.bd.tata.impl.TataTruck;

public class TataBuilder extends TruckBuilder {

	public TataBuilder(Integer capacity, String engineType, String fuleType) {
		super(capacity, engineType, fuleType);
	}

	@Override
	public Truck createTruck() {
		
		return new TataTruck(capacity, engineType, fuleType);
	}
	
}
