
public class PracMain {
	public static void main(String[] args) {
		final double PI = 3.14;
		
		AAA aaa = new AAA();
		System.out.println(aaa);
		
		Object obj = new Circle1(10);
		System.out.println(obj);
		
		Employee emp = new Regular("인간", 23, "땅굴마을", "대리");
		
	}
}

class AAA{
	public String toString() {
		return "안녕하세요";
	}
	
	public String testOverride() {
		return "오버라이딩입니다.";
	}
}

class BBB extends AAA{
	@Override
	public String testOverride() {
		return "오버라이딩BBB입니다.";
	}
}