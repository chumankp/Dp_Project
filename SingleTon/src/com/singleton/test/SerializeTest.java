package com.singleton.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.singlegton.beans.TimeStampLazy;

public class SerializeTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		/*TimeStampLazy lazy = TimeStampLazy.getInstance();
		System.out.println("Hash code before serializaction : " + lazy.hashCode());
		serializingFile(lazy,"d:\\larzytest.ser");*/
		TimeStampLazy lazy2 = (TimeStampLazy) deserializingFile("d:\\larzytest.ser");
		TimeStampLazy lazy3 = (TimeStampLazy) deserializingFile("d:\\larzytest.ser");
		System.out.println((lazy2 == lazy3)+" hash code : "+lazy2.hashCode()+":"+lazy3.hashCode());
	}

	public static void serializingFile(TimeStampLazy stampLazy, String fileName) throws FileNotFoundException, IOException {
	 ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
	 outputStream.writeObject(stampLazy);
	 outputStream.close();
	}
	public static Object deserializingFile(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));
		Object object = inputStream.readObject();
		return object;
		
	}
}
