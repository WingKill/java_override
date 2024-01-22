/*
 * class IPrinter{
 * 인스턴스 변수 + 함수만 온다.
 * }
 * */

// 상수와 추상 메서드만 온다.
interface IPrinter { // 인터페이스 간 명칭이 겹쳐서 수정한 상태.
	public abstract void print(String doc); // 추상 메소드(함수)
	// abstract 키워드를 붙인 함수
}

class Printer implements IPrinter {
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
}

interface ICalculator {
	int add(int num1, int num2);

	int sub(int num1, int num2);
	
	int mul(int num1, int num2); 
}

// 위 인터페이스를 구현하는 Calculator 객체를 생성하여 .add 함수를 테스트하시오.
class Calculator implements ICalculator {
	@Override
	public int add(int num1, int num2) {
		int add = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + add);
		return add;
	}

	@Override
	public int sub(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + sub);
		return sub;
	}

	@Override
	public int mul(int num1, int num2) {
		int mul = num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + mul);
		return mul;
	}
}

public class InterfaceMain {
	public static void main(String[] args) {

		IPrinter iPrinter = new Printer();
		iPrinter.print("안녕하세요");

		Calculator cal = new Calculator();
		cal.add(1, 2);
		cal.sub(1, 2);
		cal.mul(1, 2);
	}
}
