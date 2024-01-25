package com.java.wrapper;

public class ObjectMain {

	public static void main(String[] args) {
		Person1 p1 = new Person1("Lee", 29);
		Person1 p2 = new Person1("Lee", 29);
		
		Person1 p3 = new Person1("Lee", 30);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		System.out.println(p1);
		
		INum num1 = new INum(3);
		INum num2 = new INum(3);
		
		boolean b = num1.equals(num2);
		
		System.out.println(b);
	}

}

class INum{
	private int num;
	
	public INum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof INum) {
			INum iNum = (INum)obj;
			if(iNum.num == this.num)
				return true;
		}
		return false;
	}
}

class Person1{
	private String name;
	private int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person1) {
			Person1 person1 = (Person1) obj;
			if(this.name.equals(person1.name) && person1.age == this.age)
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String toString = "name:" + name + " age:" + age;
		return toString;
	}
}