package java_test;

class Person {
	private String name;
	private int[] gambleArr = new int[3];
	private int sameNum;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSameNum() {
		return sameNum;
	}
	
	public void gambling(Person person) {
		System.out.println("[" + name + "]:"); 
		for(int i : gambleArr) {
			i = (int)(Math.random()*3 + 1);
			System.out.print(i + " ");
		}
		
		for(int i = 0; i < gambleArr.length ; i++) {
			if(i == 0) {
				if(gambleArr[0] == gambleArr[2]) {
					sameNum += 1;
				}				 
				continue;
			}
			
			if(gambleArr[i] == gambleArr[i-1]) {
				sameNum += 1;
			}			
		}
		
		if(sameNum != 3) {
			System.out.println("아쉽군요!");
			return;
		}			
		else {
			System.out.println("님이 이겼습니다.");
			return;
		}
			
	}
}
