package com.java.test;

public class FruitMain {

	public static void main(String[] args) {
//		Fruit[] fAry = { new Grape(), new Apple(), new Pear() };
//
//		for (Fruit f : fAry)
//			f.print();
		
		Fruit fruit = new Grape();
		Grape grape = new Grape();
		Fruit fruit2 = new Fruit();
		
		if(grape instanceof Fruit) {
			System.out.println("true입니다.");
		}else {
			System.out.println("false입니다.");
		}
		
		if(fruit instanceof Grape) {
			System.out.println("true입니다.");
		}else{
			System.out.println("false입니다.");
		}
		
		if(fruit2 instanceof Grape) {
			System.out.println("true입니다.");
		}else {
			System.out.println("false입니다.");			
		}
	}
}


class Fruit{
	public void print() {
		
	}
}

class Grape extends Fruit{
	@Override
	public void print() {
		System.out.println("나는 포도입니다.");
	}
}

class Apple extends Fruit{
	@Override
	public void print() {
		System.out.println("나는 사과입니다.");
	}
}

class Pear extends Fruit{
	@Override
	public void print() {
		System.out.println("나는 배입니다.");
	}
}
