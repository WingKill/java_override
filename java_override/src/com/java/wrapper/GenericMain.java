package com.java.wrapper;

public class GenericMain {
	public static void main(String[] args) {
//		DBox<String, Integer> dBox = new DBox<String, Integer>();
//		DBox<Apple, Orange> fruitBox = new DBox<Apple, Orange>(); // BeforeGenericMain에 있는 Apple, Orange
//		
//		dBox.set("Apple", 25);
//		fruitBox.set(new Apple(), new Orange());  // BeforeGenericMain에 있는 Apple, Orange
//
//		System.out.println(dBox);
//		System.out.println(fruitBox);
		
//        DBox<String, Integer> box1 = new DBox<>();
//        box1.set("Apple", 25);
//        DBox<String, Integer> box2 = new DBox<>();
//        box2.set("Orange", 33);       
//        DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
//        ddbox.set(box1, box2);
//        System.out.println(ddbox);
        
        Box1<Integer> box11 = new Box1<>();
        box11.set(99);
        Box1<Integer> box21 = new Box1<>();
        box21.set(55);
        System.out.println(box11.get() + " & " + box21.get());
        swapBox(box11, box21);
        System.out.println(box11.get() + " & " + box21.get());
	}
	
	public static void swapBox(Box1<Integer> box1, Box1<Integer> box2) {
		Box1<Integer> testbox = new Box1<Integer>();
		testbox.set(box1.get());
		box1.set(box2.get());
		box2.set(testbox.get());
	}
}

class Box1<T>{
	private T box;
	
	public void set(T box) {
		this.box = box;
	}
	
	public T get() {
		return box;
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
		return left+ " & " + right;
		// 객체 + 문자열 + 객체
		// 리턴 타입이 String으로 넘어온다. 
	}
}

class DDBox<L,R>{
	private L left;
	private R right;
	public void set(L l, R r){
		left = l;
		right = r;
	}
	
	@Override
	public String toString() {
		return left+ "\n" + right;
		// 객체 + 문자열 + 객체
		// 리턴 타입이 String으로 넘어온다. 
	}
}