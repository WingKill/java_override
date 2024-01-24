package com.java.wrapper;

import java.math.BigInteger;
import java.util.Random;
import java.util.StringTokenizer;

public class ClassTest {

	public static void main(String[] args) {
//		System.out.println(Integer.toBinaryString(12));
//		System.out.println(Integer.toOctalString(12));
//		System.out.println(Integer.toHexString(12));
//		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		
//		System.out.println(Integer.max(1, 2));
//		System.out.println(Integer.min(1, 2));
//		System.out.println(Integer.sum(1, 2));
//		
//		System.out.println("최대 정수: " + Long.MAX_VALUE);
//		System.out.println("최소 정수: " + Long.MIN_VALUE);
//		System.out.println();

		// 매우 큰 수를 BigInteger 인스턴스로 표현
		BigInteger big1 = new BigInteger("100000000000000000000");
		BigInteger big2 = new BigInteger("-99999999999999999999");

		// BigInteger 기반 덧셈 연산
		BigInteger r1 = big1.add(big2);
		System.out.println("덧셈 결과: " + r1);

		// BigInteger 기반 곱셈 연산
		BigInteger r2 = big1.multiply(big2);
		System.out.println("곱셈 결과: " + r2);
		System.out.println();

		// 인스턴스에 저장된 값을 int형 정수로 반환
		int num = r1.intValueExact();
		System.out.println("From BigInteger: " + num);

		// 제곱근 구하는 함수
		System.out.println(Math.pow(2, 16)); // 2의 16승
		System.out.println();

		// 난수

		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println(rand.nextInt(10) + 1); // 범위 제한.
		}
		System.out.println("====");
		Random rand2 = new Random(1); // 시드값을 부여하고, 재 사용시 해당 랜덤값이 표현
		for (int i = 0; i < 6; i++) {
			System.out.println(rand2.nextInt(10) + 1);
		}

		StringTokenizer st1 = new StringTokenizer("PM:08:45", ":");

		while (st1.hasMoreTokens())// 토큰이 있으면
			System.out.print(st1.nextToken() + ' '); // 해당 내용을 출력하라.
		System.out.println();

		StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 2 = 44", "+-/= ");

		while (st2.hasMoreTokens())
			System.out.print(st2.nextToken() + ' ');
		System.out.println();
		String text = "Java,Python,C++,JavaScript";
        // 쉼표(,)를 구분자로 사용하여 문자열을 토큰으로 분리
        StringTokenizer tokenizer = new StringTokenizer(text, ",");

        // hasMoreTokens()를 사용하여 토큰이 더 존재하는지 여부 확인
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("Token: " + token);
        }
        
        String str = "inpa@tistory@com@super@power";
		StringTokenizer st11 = new StringTokenizer(str, "@");

		while (st11.hasMoreTokens())// 토큰이 있으면
			System.out.print(st11.nextToken() + ' '); // 해당 내용을 출력하라.
		System.out.println();
	}

}
