package com.java.wrapper;

import java.util.Scanner;

class Person22{
	private String name;
	private int age;
	public Person22(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// name : Lee  age : 29
		return "name : " + name + "  age : " + age ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person22) {
			Person22 person = (Person22) obj;
			if(person.name.equals(this.name) && person.age == this.age)
				return true;
		}
		return false;
	}
}
public class TestMain {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		String rotate = sc.nextLine();
//		String[] rotation = new String[rotate.length()];
//		for (int i = 0; i < rotate.length(); i++) {
//			String partialWord = rotate.substring(i) + rotate.substring(0, i);
//			rotation[i] = partialWord;
//			System.out.println(partialWord + "\n");
//		}
//		sc.close();
		
        Person22 p1 = new Person22("Lee", 29);
        Person22 p2= new Person22("Lee", 29);
        
        Person22 p3= new Person22("Lee", 30);
        
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
        
        System.out.println(p1); // name : Lee  age : 29
		
//		MyPoint p = new MyPoint(3, 50);
//		MyPoint q = new MyPoint(4, 50);
//		System.out.println(p);
//		if(p.equals(q)) 
//			System.out.println("같은 점");
//		else 
//			System.out.println("다른 점");
//		
		// 출력
		// Point(3,50)
		// 다른점		
//
//		Circle a = new Circle(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
//		Circle b = new Circle(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
//		System.out.println("원 a : " + a);
//		System.out.println("원 b : " + b);
//		if(a.equals(b))
//			System.out.println("같은 원");
//		else 
//			System.out.println("서로 다른 원");
//
		// 출력
		// 원 a : Circle(2,3)반지름5
		// 원 b : Circle(2,3)반지름3
		// 같은 원
//		
		//>I love Java.
		//어절 개수는 3
		//>자바는 객체 지향 언어로서 매우 좋은 언어이다.
		//어절 개수는 7
		//>그만
		//종료합니다...
		// [Hint] Scanner.nextLine()을 이용하면 빈칸을 포함하여 한 번에 한 줄을 읽을 수 있다.
//
//		Scanner sc = new Scanner(System.in);
//		String testText = "";
//		System.out.print(">");
//		StringTokenizer tokenizer;
//		while(true) {
//			testText = sc.nextLine();
//			if(testText.equals("그만")) {
//				System.out.println("종료합니다...");
//				break;
//			}	
//			tokenizer = new StringTokenizer(testText, " ");
//			int count = 0;
//			while(tokenizer.hasMoreTokens()) {
//				String x1 = tokenizer.nextToken();
//				count = count + 1;		
//			}
//			System.out.println("어절 개수는 "+ count);		
//		}
				
					
		
//		while(true) {
//			testText = sc.nextLine();
//			if(testText.equals("그만")) {
//				System.out.println("종료합니다...");
//				break;
//			}
//			int count = 0;
//			for(int i = 0; i < testText.length(); i++) {
//				if(testText.equals(" ")) {
//					break;
//				}				
//				if(testText.charAt(i) == ' ') {
//					count++;
//				}
//			}
//			if(testText.length() != 0 && !testText.equals(" ")) {
//				count = count + 1;
//			}
//			System.out.println("어절 개수는 "+ count);
//		}	
// 		sc.close();
	}
}

class Circle{
	private int pointX;
	private int pointY;
	private int radius;
	public Circle(int pointX,int pointY,int radius) {
		this.pointX = pointX;
		this.pointY = pointY;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		// Circle(2,3)반지름5
		String circleText = "Circle("+pointX+","+pointY+")반지름"+radius;
		return circleText;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle circle = (Circle) obj;
			if(circle.pointX == this.pointX && circle.pointY == this.pointY)
				return true;
		}
		return false;
	}
}

class MyPoint{
	private int point1;
	private int point2;
	public MyPoint(int point1, int point2) {
		this.point1 = point1;
		this.point2 = point2;
	}
	
	@Override
	public String toString() {
		String pointStr = "Point("+point1+","+point2+")";
		return pointStr;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyPoint) {
			MyPoint myPoint = (MyPoint) obj;
			if(myPoint.point1 == this.point1 && myPoint.point2 == this.point2)
				return true;
		}
		return false;
	}
}
