package com.java.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
//		ICalculator cal = new Calculators();
//		System.out.println(cal.add(6, 5));
//		System.out.println(cal.sub(6, 5));
//		System.out.println(cal.mul(6, 5));
//		System.out.println(cal.div(6, 0));
		
		
	}

}
interface ICalculator {
	int add(int x, int y);
	int sub(int x, int y);
	int mul(int x, int y);
	int div(int x, int y);
}

class Calculators implements ICalculator{

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return  x - y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return  x * y;
	}

	@Override
	public int div(int x, int y) {
		int result = 0;
		try {
			result = x/y;
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("계산기 종료");
		}	
		return result;			
	}
}