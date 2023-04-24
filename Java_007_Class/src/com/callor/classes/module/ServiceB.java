package com.callor.classes.module;

public class ServiceB {
	public void scorePrint(String name, int korea, int math, int english) {
		int num = korea + math + english; // 총점
		float num2 = (float) num / 3; // 평균

		System.out.println("==============================");
		System.out.println("이름 국어 수학 영어 총점 평균");
		System.out.println("------------------------------");
		System.out.printf("%s  %d  %d %d  %d  %.1f \n", name, korea, math, english, num, num2);
		System.out.println("==============================");
	}
}
