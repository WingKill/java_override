package java_test;

import java.util.Scanner;

class PersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.print("1번째 선수 이름>>");
		p1.setName(sc.next());
		System.out.print("2번째 선수 이름>>");
		p2.setName(sc.next());
		Gambling gamble = new Gambling(); // 겜블 시작
		while(gamble.getGameWin() == false){ // 승리 판단이 나올 때까지 반복
			Person[] gamers = {p1,p2}; 
			gamble.gambling(gamers); // 연산 과정이 길어서 따로 클래스로 빼서 연산 진행.
		}
		sc.close(); // Scanner 객체 사용 후 끝내기.
	}
}
