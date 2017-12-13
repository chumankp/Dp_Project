package com.bd.api;

import java.lang.reflect.Constructor;

import com.bd.builder.TruckBuilder;
import com.bd.exception.UnknownClaassNameException;

public abstract class Truck {
	protected int capacity;
	protected String truckType;
	protected String engineType;
	protected String fuleType;
	protected int tyre;
	protected int mileage;

	public Truck(Integer capacity, String engineType, String fuleType) {
		this.capacity = capacity;
		this.engineType = engineType;
		this.fuleType = fuleType;
	}

	public static TruckBuilder createBuilder(Integer capacity, String engineType, String fuleType) {
		String sysTruckbuilderName = null;
		Constructor<?> builderConstructor = null;
		TruckBuilder truckBuilder= null;
		Class<?> clazz = null;
		try {
			sysTruckbuilderName = System.getProperty("com.bd.builder");
			clazz = Class.forName(sysTruckbuilderName);
			builderConstructor = clazz.getConstructor(Integer.class, String.class, String.class);
			truckBuilder = (TruckBuilder)builderConstructor.newInstance(capacity,engineType,fuleType);
			
		}catch (Exception e) {
			throw new UnknownClaassNameException("Provide appropiate ClassName", e);
		}
		return truckBuilder;

	}

	public abstract int accelerator(int speed);

	public abstract String drive();

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getFuleType() {
		return fuleType;
	}

	public void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}

	public int getTyre() {
		return tyre;
	}

	public void setTyre(int tyre) {
		this.tyre = tyre;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Truck [capacity=" + capacity + ", truckType=" + truckType + ", engineType=" + engineType + ", fuleType="
				+ fuleType + ", tyre=" + tyre + ", mileage=" + mileage + "]";
	}
	

}
