package com.singleton.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.singlegton.beans.TimeStampLazy;

public class RefTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> clazz = Class.forName("com.singlegton.beans.TimeStampLazy");
		Constructor<?> dconstructor = clazz.getDeclaredConstructor(null);
		dconstructor.setAccessible(true);
		TimeStampLazy lazy = (TimeStampLazy) dconstructor.newInstance();
		//TimeStampLazy lazy2 = (TimeStampLazy) dconstructor.newInstance();
		System.out.println((lazy)+ ":"+lazy.hashCode());
		
	}

}
