package com.callodr.controller;

public class ControllerD {
	public static void main(String[] args) {
		/*
		 * 랜덤수 51 ~ 100까지 범위의 랜덤수 100개 생성 생성된랜덤수 중에 짝수가 몇개인가 판별
		 */
		int count = 0;
		int intTotal = 0;
		int intfloatAvg = 0;
		for (int i = 0; i < 100; i++) {
			int intRnd = (int) (Math.random() * 50) + 51;
			if (intRnd % 2 == 0) {
				System.out.println(intRnd);
				count++;
				// 누적 : 숫자값을 계속 쌓아서 덧셈
				intTotal = intTotal + intRnd;
			}
		}
		System.out.println(intTotal);
		intfloatAvg = intTotal / count;
		
		System.out.printf(" 짝수의 개수 : %d \n",count );
		System.out.printf("짝수의 개수 : %d \n",intfloatAvg);
		System.out.printf("짝수의 개수 : %d \n",intTotal);
	}

}
