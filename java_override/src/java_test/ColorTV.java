package java_test;



public class ColorTV extends TV{
	//[1번] 다음 main() 메소드와 실행 결과를 참고하여 
	//TV를 상속받은 ColorTV 클래스를 작성하라.
	private int color = 0;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
		
	// 32인치 1024컬러
	
	
}

