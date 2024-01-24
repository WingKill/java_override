package com.java.wrapper;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String rotate = sc.nextLine();
		String[] rotation = new String[rotate.length()];
		for (int i = 0; i < rotate.length(); i++) {
			String partialWord = rotate.substring(i) + rotate.substring(0, i);
			rotation[i] = partialWord;
			System.out.println(partialWord + "\n");
		}
		sc.close();
	}
}
