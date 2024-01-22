import java.util.Scanner;

interface Printable {
	public static final int PAPER_WIDTH = 90;
	public static final int PAPER_HEIGHT = 100;

	public abstract void print(String doc);

	default void printCMYK(String doc) {
		System.out.println("CMYK ver");
		System.out.println(doc);
	}
}

interface ColorPrintable extends Printable {
	void printCMYK(String doc);
}

class SamsungPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class LGPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}

class Prn909Drv implements ColorPrintable {

	@Override
	public void print(String doc) {
		System.out.println("From MD - 909 black&white ver");
		System.out.println(doc);
	}

	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD - 909 CMYK ver");
		System.out.println(doc);

	}
}

abstract class Pet {
	public abstract void eat();

	public void run() {
		System.out.println("뛰어 다닙니다.");
	}
}

class dog extends Pet {
	@Override
	public void eat() {
		System.out.println("밥을 먹습니다.");
	}
}

abstract class Calc {
    protected int a;
    protected int b;
    public void setValue(int a, int b) {
       this.a = a;
       this.b = b;
    }
    abstract int calculate();
}

class Add extends Calc{
    public int calculate() {
    	return a+b;
    }
}

class Sub extends Calc{
	public int calculate() {
    	return a-b;
    }
}

class Mul extends Calc{
	public int calculate() {
    	return a*b;
    }
}

class Div extends Calc{
	public int calculate() {
    	return a/b;
    }
}

public class PrinterTest {
	public static void main(String[] args) {
//		String myDoc = "This is a report about...";
//
//		Printable prn = new SamsungPrinterDriver();
//		prn.print(myDoc);
//		System.out.println();
//		prn = new LGPrinterDriver();
//		prn.print(myDoc);
//		System.out.println();
//
//		ColorPrintable prn2 = new Prn909Drv();
//		prn2.print(myDoc);
//		prn2.printCMYK(myDoc);
//
//		Pet pet = new dog();
//		pet.run();

		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0); // 문자열의 첫번째 글자를 가져오는 것.
		Calc cal;
		
		switch (c) {
		case '+':
			cal = new Add();
			break;
		case '-':
			cal = new Sub();
			break;
		case '*':
			cal = new Mul();
			break;
		case '/':
			cal = new Div();
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
			sc.close();
			return;
		}
		cal.setValue(a, b);
		result = cal.calculate();
		System.out.println(result);
		sc.close();
	}
}
