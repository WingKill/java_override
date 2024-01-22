
public class PracticeMain {
	public static void main(String[] args) {
//		Box box = new Box();
//		PaperBox box2 = new PaperBox();
//		GoldPaperBox box3 = new GoldPaperBox();
//		
//		warpBox(box);
//		warpBox(box2);
//		warpBox(box3);
		
		Friend[] myFriend = new Friend[10];
		int cnt = 0;
		myFriend[cnt++] = new ComFriend("진", "010-2233-4455", "사원"); 
		myFriend[cnt++] = new UnivFriend("장이란", "010-3344-5566", "교육학과");
		
		for(int i = 0 ; i < cnt ; i++) {
			myFriend[i].showInfo();
			System.out.println();
		}
		
		String x = "";
		String y = "23";
		Object z = "xyz";
		// String 내 선언된 함수를 사용할 수 없음.
		// Object 클래스 내에 선언된 11개의 함수만 사용 가능.
		// 메서드 오버라이딩된 상태이기 때문에, z의 equals()는 String의 equals() 내용을 실행한다.
		
		if(x.equals(y)) 
			System.out.println("같습니다.");
		else
			System.out.println("다릅니다");
	}
	
	public static void warpBox(Box box) {
		if(box instanceof GoldPaperBox) {
			((GoldPaperBox)box).goldPaperWarp();
		}else if(box instanceof PaperBox) {
			((PaperBox)box).paperWarp();
		}else {
			box.simpleWarp();
		}
	}
}
