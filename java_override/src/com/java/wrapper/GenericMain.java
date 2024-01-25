package com.java.wrapper;

public class GenericMain {
	public static void main(String[] args) {
		DBox<String, Integer> dBox = new DBox<String, Integer>();
		DBox<Apple, Orange> fruitBox = new DBox<Apple, Orange>(); // BeforeGenericMain에 있는 Apple, Orange
		
		dBox.set("Apple", 25);
		fruitBox.set(new Apple(), new Orange());  // BeforeGenericMain에 있는 Apple, Orange

		System.out.println(dBox);
		System.out.println(fruitBox);		
	}
}

// 다중 매개변수 기반 제네릭 클래스
class DBox<L,R>{
	private L left;
	private R right;
	public void set(L l, R r){
		left = l;
		right = r;
	}
	
	@Override
	public String toString() {
		return left+ "&" + right;
		// 객체 + 문자열 + 객체
		// 리턴 타입이 String으로 넘어온다. 
	}
}