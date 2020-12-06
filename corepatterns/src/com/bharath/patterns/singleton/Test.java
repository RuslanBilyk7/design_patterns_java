package com.bharath.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		DateUtil dateUtil1 = DateUtil.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("/C:/Users/RuslanBilyk/Documents/1/1.txt"));
		oos.writeObject(dateUtil1);

		DateUtil dateUtil2;
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("/C:/Users/RuslanBilyk/Documents/1/1.txt"));
		dateUtil2 = (DateUtil) ois.readObject();
		
		oos.close();
		ois.close();

		System.out.println(dateUtil1 == dateUtil2);
	}

}
