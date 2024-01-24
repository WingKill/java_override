package com.java.wrapper;

import java.util.Scanner;

public class TestMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student("다정학교", "공학과", "22341-544223");
		System.out.println("8학기 학점을 순서대로 입력하세요.");
		double[] grades = student.getGrades();
		for(int i = 0; i < 8; i++) {
			System.out.println(i+1 + "학기 학점 -> ");
			double grade = sc.nextDouble();
			grades[i] = grade;
			System.out.println();
			if(i == 7) {
				System.out.println("학점 평균 -> " + student.average());
			}
		}
		
		sc.close();
	}

}

class Person{
	private String name;
	private int age;
	private String address;
}

class Student{
	private String school;
	private String major;
	private String StudentID;
	private double[] grades = new double[8];
	
	public Student(String school, String major, String StudentID) {
		this.school = school;
		this.major = major;
		this.StudentID = StudentID;
	}
	
	
	public double[] getGrades() {
		return grades;
	}


	public void setGrades(double[] grades) {
		this.grades = grades;
	}


	public double average() {
		double sum = 0;
		for(double grade : grades) {
			sum += grade;
		}
		return sum/8;
	}
}