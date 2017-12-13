package com.bd.builder;

import com.bd.api.Truck;

public abstract class TruckBuilder {
	protected int capacity;
	protected String truckType;
	protected String engineType;
	protected String fuleType;
	protected int tyre;
	protected int mileage;

	public TruckBuilder(Integer capacity, String engineType, String fuleType) {
		super();
		this.capacity = capacity;
		this.engineType = engineType;
		this.fuleType = fuleType;
	}

   public abstract Truck createTruck();
	public Truck build() {
		Truck truck = createTruck();
		truck.setTruckType(truckType);
		truck.setMileage(mileage);
		truck.setTyre(tyre);
		return truck;
	}

	public TruckBuilder setcapacity(int capacity) {
		this.capacity = capacity;
		return this;
	}

	public TruckBuilder settruckType(String truckType) {
		this.truckType = truckType;
		return this;
	}

	public TruckBuilder setengineType(String engineType) {
		this.engineType = engineType;
		return this;
	}

	public TruckBuilder setfuleType(String fuleType) {
		this.fuleType = fuleType;
		return this;
	}

	public TruckBuilder settyre(int tyre) {
		this.tyre = tyre;
		return this;
	}

	public TruckBuilder setmileage(int mileage) {
		this.mileage = mileage;
		return this;
	}

}
