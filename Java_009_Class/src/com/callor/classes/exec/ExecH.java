package com.callor.classes.exec;

public class ExecH {
	public static void main(String[] args) {
		int[] nums = new int[50];
		for (int index = 0; index < 10; index++) {
			nums[index] = (int) (Math.random() * 50) + 51;
		}
		// 조건에 맞는 개수와 조건에 맞는 값의 합계를 계산
		// 개수와 합계를 저장할 변수를 선언
		int num = 0; // 3의 배수 개수를 저장할 변수 선언
		int num2 = 0; // 3의 배수들의 합계를 저장할 변수 선언
		for (int index = 0; index < 10; index++) {
			if (nums[index] % 3 == 0) { // nums[index] 값이 3의 배수이면
				num++; // 3의 배수를 찾을 때마다 누적시켜주기, 가장 마지막값만 저장, 3의 배수의 개수
				num2 += (nums[index]); // 3의 배수들의 합, 누적(계속 더하기)
			}
		}
		System.out.println("3의 배수 개수 : " + num + ", 3의 배수들의 합 : " + num2);
	}
}
