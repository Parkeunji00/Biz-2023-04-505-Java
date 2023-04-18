package com.callor.controller.var;

public class VarA {
	public static void main(String[] args) {
		int intKor = 80;
		int intEng = 90;
		int intMath = 97;
		int intTotal = intKor + intEng + intMath;
		
		// 소수점이하 평균 오차를 찾기위해
		// 젓우를 실수(float)로 강제 형 변환하여 연산수행
		float floatAvg = (float)intTotal/3f;
		
		System.out.println("===================");
        System.out.println("국어 : " + intKor);
        System.out.println("수학 : " + intMath);
        System.out.println("영어 : " + intEng);
		System.out.println("-------------------");
		System.out.printf(" 총점 : %3d, 평균 : %5.2f", intTotal, floatAvg);
	}

}
