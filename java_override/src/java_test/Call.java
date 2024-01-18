package java_test;

class Shape {

}

class Circle extends Shape{
	
}

class Rectangle extends Shape{
	
}

class Cake{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake{
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Cheese Cake");
	}
	
	public void tasty() {
		super.yummy();
		System.out.println("Yummy Tasty Cake");
	}	
}


public class Call {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Circle();
		shape = new Rectangle();
		
		Shape[] shapeArr = new Circle[5];
		for(int i = 0; i < shapeArr.length ; i++) {
			shapeArr[i] = new Circle();
		}
		
		for(Shape i : shapeArr) {
			System.out.println(i);
		}
			
		shapeArr = new Rectangle[6];
		
		Shape[] shapeArr2 = {new Circle(),new Rectangle()};
		
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		
		c1.yummy();
		c2.yummy();
		
		MoneyArr mArr = new MoneyArr(126000);
		mArr.show();
	}
}
