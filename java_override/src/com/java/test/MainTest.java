package com.java.test;

//위의 인터페이스를 구현하는 Calculator 객체를 생성하여, add 함수를 테스트 하시오.
interface ICaculator {
    int add(int num1, int num2);
}


class Calculator implements ICaculator{
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		int addNum = num1 + num2;
		System.out.println("결과 : " + addNum);
		return addNum;
	}	
}

interface Printable {
    public abstract void print(String doc);
}

//SPrinterDriver 와 LPrinterDriver를 만드시오

class SPrinterDriver implements Printable{

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
	
}

class LPrinterDriver implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);		
	}
	
}

/*
출력:
From Samsung printer
This is a report about ...

From LG printer
This is a report about ...
*/

public class MainTest {

	public static void main(String[] args) { 
		int[] y = new int[5];
		for(int i = 0; i < 6; i++) {
			y[i] = i;
			System.out.println(y[i]);
		}
		
		Calculator cal2 = new Calculator();
		Printable prn = new SPrinterDriver();
		
		cal2.add(1, 2);
		
		String myDoc = "This is a report about...";

		// 삼성 프린터로 출력
		
		prn.print(myDoc);

		System.out.println();

		// LG 프린터로 출력
		prn = new LPrinterDriver();
		prn.print(myDoc);        
		
	}

}
