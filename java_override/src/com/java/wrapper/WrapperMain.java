package com.java.wrapper;

import java.math.BigInteger;

public class WrapperMain {

	public static void main(String[] args) {

		int num1 = 10;	
		String x233 = "-213";
		System.out.println(Integer.valueOf(x233));

		Integer iObj = new Integer(10);
		System.out.println(num1);
		System.out.println(iObj);

		int num11 = iObj.intValue();
		System.out.println(num11);

		num11 = iObj;
		System.out.println(num11);

		Integer iObj2 = 20;
		System.out.println(iObj2);
		System.out.println(iObj2.doubleValue());

		Number[] numberArr = { new Integer(20), new Double(3.14) };

		double sum = 0;
		for (Number number : numberArr) {
			sum = sum + number.doubleValue();
		}

		System.out.println(sum);
		String s = "x";

	}

}
