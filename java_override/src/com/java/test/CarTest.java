package com.java.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CarTest {
	public static void fun1() throws ArithmeticException {
		System.out.println("함수 호출");
		System.out.println(4 / 0);
	}

	public static void fun2() throws IOException {
		System.out.println("함수 호출");
	}

	public static void main(String[] args) {
		// fun1();
		try {
			fun2();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Path file = Paths.get("C:\\Users\\601-16\\Documents\\Simple.txt");

		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);
			writer.write("A"); // IO Exception
			writer.write("Z"); // IO Exception

			if (writer != null) // IO Exception
				writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
