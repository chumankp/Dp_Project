package com.singlegton.beans;

import java.io.Serializable;

/**
 * @author ME
 *
 */
abstract public class TimeStampLazy implements Cloneable, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static TimeStampLazy instance;
	
	private TimeStampLazy() {
		// System.out.println("Lazy Instance is called()");
		//don't remove this . it use in singleton object
	}

	public static TimeStampLazy getInstance(){
		//double-checking 
		if (instance == null) {
			synchronized (TimeStampLazy.class) {
				if (instance == null) {
					instance = new TimeStampLazy() {};
				}
			}
		}
		return instance;
	}
	
	// Avoid return one more object during deserialization
	
	public Object readResolve() {
		if (instance == null) {
			instance = TimeStampLazy.getInstance();
		}
		return instance;
		
	}
	
	//dont allow to Cloneing other class 
	@Override
	public Object clone() throws CloneNotSupportedException  {
		throw new CloneNotSupportedException("Clone is not supported");
	}

}
