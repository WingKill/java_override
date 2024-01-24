package com.java.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CarTest {
	public static void fun1() throws ArithmeticException {
		System.out.println("함수 호출");
		System.out.println(4 / 0);
	}

	public static void fun2() throws IOException {
		System.out.println("함수 호출");
	}

	public static void main(String[] args) {
		// fun1();
		try {
			fun2();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Path file = Paths.get("C:\\Users\\601-16\\Documents\\Simple.txt");
		String x = "wexryqzo";
		x.length();
		x.charAt(0);
		
		Solution xrr = new Solution();
		System.out.println(xrr.solution("aukks", "wbqd", 5));
		
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);
			writer.write("A"); // IO Exception
			writer.write("Z"); // IO Exception

			if (writer != null) // IO Exception
				writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char sChar;
        for(int i = 0; i < s.length(); i++){
            sChar = s.charAt(i);
            for(int j = 1; j <= index ; j++){                
                sChar += 1;
                for(int k = 0; k < skip.length(); k++){
                    char skipChar = skip.charAt(k);
                    if(sChar != skipChar){
                        continue;
                    }else if(sChar == skipChar){
                        sChar += 1;            
                    } 
                } 
            }     
            
            if(sChar > 'z'){
                sChar = (char)(sChar - 'z' - 1 + 'a');
            }  
            answer += String.valueOf(sChar);
        }
        return answer;
    }
}