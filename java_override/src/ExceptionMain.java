// import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		try {
//			System.out.print("a/b ... a? ");
//			int n1 = sc.nextInt();
//			// InputMismatchException
//			System.out.print("a/b ... b? ");
//			int n2 = sc.nextInt();
//			System.out.println(n1/n2);
//			// ArithmeticException
//		}catch (Exception e) { // 예외 : 0으로 나눌 때
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("예외가 발생되었습니다.");
//		}
//		System.out.println("Good bye");		
		try {
			md1(3); // md1으로부터 예외가 넘어온다.
		}catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Good bye");
	}
	
	public static void md1(int n) {
		md2(n,0); // m2로부터 예외가 넘어온다.
	}

	public static void md2(int n1, int n2) {
		int r = n1/n2;		// 예외 발생
	}
	
	
}
