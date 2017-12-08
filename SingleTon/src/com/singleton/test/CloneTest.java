package com.singleton.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.singlegton.beans.TimeStampLazy;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		TimeStampLazy lazy = TimeStampLazy.getInstance();
		TimeStampLazy lazy2 = (TimeStampLazy) lazy.clone();
		System.out.println((lazy)+ ":"+lazy.hashCode()+" :");
	}

}
