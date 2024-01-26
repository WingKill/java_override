//package com.java.wrapper;
//
//public class BeforeGenericMain {
//
//	public static void main(String[] args) {
//		Box<Apple> aBox = new Box<Apple>(); // T를 Apple로 결정
//		Box<Orange> oBox = new Box<Orange>(); // T를 Orange로 결정
//
////		aBox.set(new Apple()); // 사과를 상자에 담는다. // 타입을 미리 정한 뒤 객체가 생성된다.
////		oBox.set(new Orange()); // 오렌지를 상자에 담는다.
////
////		Apple ap = aBox.get(); // 사과를 꺼내는데 형 변환 하지 않는다.
////		Orange og = oBox.get(); // 오렌지를 꺼내는데 형 변환 하지 않는다.
////
////		System.out.println(ap);
////		System.out.println(og);
//
//		Box<String> sBox = new Box<>();
//		sBox.set("I\'m so happy");
//		Box<Box<String>> wBox = new Box<>(); // 매개변수화 타입을 타입 인자로 전달 가능하다.
//		wBox.set(sBox);
//
//		Box<Box<Box<String>>> zBox = new Box<>();
//		zBox.set(wBox);
//
//		System.out.println(zBox.get().get().get());
//
//		Box<Integer> iBox = new SteelBox<Integer>(7959);
//		Box<String> ssBox = new SteelBox<String>("Simple");
//		// Box<String> iiBox = new SteelBox<Integer>(7959); // 해당 코드는 컴파일 에러가 발생한다.
//		//
//
//	}
//
//}
//
//class Apple {
//	@Override
//	public String toString() {
//		return "I am an apple.";
//	}
//}
//
//class Orange {
//	@Override
//	public String toString() {
//		return "I am an orange.";
//	}
//}
//
//// 다음 상자는 사과도 오렌지도 담을 수 있다.
////class Box<T> { // 무엇이든 저장하고 꺼낼 수 있는 상자 // 제네릭하기 전에는 오류 발생이 많았다.
////	protected T ob;
////
////	public void set(T o) {
////		ob = o;
////	}
////
////	public T get() {
////		return ob;
////	}
////
////	public String toString() {
////		return ob.toString();
////	}
////}
////
////class SteelBox<T> extends Box<T> {
////	public SteelBox(T o) { // 제네릭 클래스의 생성자
////		ob = o;
////	}
////}
