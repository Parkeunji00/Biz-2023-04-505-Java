package com.callor.controller;

public class ControllerD {
	public static int prime() {
		int rndNum = (int) (Math.random() * 50) + 51;
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				return 0;
			}
		}
		return rndNum;
	}

	public static void main(String[] args) {
		int numCount = 0; // 소수의 개수
		int numSum = 0; // 소수의 합
		
		for(int i = 0; i < 100; i++) {
			int rndNum = prime();
			if (rndNum > 0) {
				numCount++;
				numSum += rndNum;
			}
		} // end for
		System.out.printf(" 소수의 개수 : % d , 소수의 합 %d\n", numCount, numSum);
	}
}
