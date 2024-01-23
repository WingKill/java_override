package com.java.test;

import java.util.Scanner;

class Gambling {
	private boolean gameWin = false; // 게임 승리 유무를 판단하는 boolean 값
	private int[] gambleArr = new int[3]; // 겜블 배열
	private int sameNumCount = 0; // 같은 숫자의 개수를 체크하는 변수
	
	public boolean getGameWin() { // 승리 판단용 메서드
		return gameWin; // true or false 값 리턴
	}
	
	public void gambling(Person[] gamers) { // Person[] 타입을 받는 gambling 메서드
		Scanner sc = new Scanner(System.in); // 스페이스를 누르면 다음 사람의 데이터를 보여주기.
		while(gameWin == false) {
			for(Person player : gamers) {
				System.out.println("[" + player.getName() + "]:"); // 사람 이름
				gambling(player); // 겜블 연산을 진행하는 메서드
				if(gameWin == true) // gameWin이 true라 하더라고 for문은 진행되므로
					break; // 중간에 끊어질 수 있는 break 문을 담는 것.
				sc.nextLine(); // next()는 스페이스를 누르면 
			}	
		}
		sc.close(); // Scanner 객체 사용 후 끝내기.
	}
	
	private void gambling(Person person) {
		for(int i = 0 ; i < gambleArr.length; i++) {
			gambleArr[i] = (int)(Math.random()*3 + 1);
			System.out.print(gambleArr[i] + " ");
		}
		
		for(int i = 0; i < gambleArr.length ; i++) {
			if(i == 2) { // 2에서는 3이 있을 수 없다.
				if(gambleArr[2] == gambleArr[0]) {
					// 값이 같으면 count올리고 연산 넘기기
					sameNumCount += 1;
					continue; 
				}else// 값이 다르면 바로 해당 연산 넘기기
					continue;
			}
			
			if(gambleArr[i] == gambleArr[i+1]) {
				sameNumCount += 1;
			}					
		}
		
		if(sameNumCount != 3) {
			System.out.print("아쉽군요!");
			sameNumCount = 0; // 이후 게임 진행에 영향이 가지 않도록 초기화
			return;
		}			
		else{
			System.out.print(person.getName()+"님이 이겼습니다.");
			sameNumCount = 0; // 이후 게임 진행에 영향이 가지 않도록 초기화
			gameWin = true;
			return;
		}
	}
}
