package com.java.test;

class MoneyArr {
	private long money;
	// 화폐의 단위를 담은 배열
	private long[] unit = {50000,10000,5000,1000,500,100,50,10};
	
	// 돈을 화폐 단위 별로 나누었을 때 나오는 개수
	private long[] unitCount = new long[unit.length]; 
	
	public MoneyArr(long money) {
		this.money = money;
	}
	
	public void show() {
		// 나머지가 담기는 변수. 총액과 나머지를 따로 보여줘야 한다면 ... 필요할 것
		long remain = 0; 
		// enhanced for문
//		for(long i : unit) {				 
//			if(i == 50000) {
//				System.out.println(i+"원"+(money/i)+"개");
//				remain = money % i;				
//			}				
//			else {
//				System.out.println(i+"원"+(remain/i)+"개");
//				remain = remain % i;
//			}			
//		}	
		//일반 for문
//		for(int i = 0;i < unit.length; i++) {
//			if(unit[i] == unit[0]) {
//				unitCount[i] = money/unit[i];
//				System.out.println(unit[i]+"원"+unitCount[i]+"개");
//				remain = money % unit[i];		
//			}else {
//				unitCount[i] = remain/unit[i];
//				System.out.println(unit[i]+"원"+(unitCount[i])+"개");
//				remain = remain % unit[i];
//			}
//		}
		
		// 나머지의 초기값을 money로 하게 되면, 조건문을 추가로 할 필요가 없어진다.
        remain = money; 
		//일반 for문
		for(int i = 0;i < unit.length; i++) {
			unitCount[i] = remain/unit[i];
			System.out.println(unit[i]+"원"+(unitCount[i])+"개");
			remain = remain % unit[i];
		}
	}
}
