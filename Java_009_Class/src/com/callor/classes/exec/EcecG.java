package com.callor.classes.exec;

public class EcecG {

	// 매개변수 num 변수로 전달받은 값이
	// prime 이면 num 을 아니면 0을 return 하는 method 선언
	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) { // 소수가 아닌수를 판별
				return 0; // 소수가 아니면0
			}
		}
		return num; // 소수라면 num 에 저장된 수
	}
	public static void main(String[] args) {
		int[] nums = new int[50]; // 정수형 50개를 nums 이름으로 선언

		for (int index = 0; index < nums.length; index++) {
			nums[index] = (int) (Math.random() * 50) + 51; // 51~100 개의 랜덤수를 생성하여 각 요소에 저장
		}
		for (int index = 0; index < nums.length; index++) {
			// prime method 야 nums 배열의 index 번째 요소(값)을 
			// 너에게 보내니 (전달하니) 그 값이 prime 수 인지 알려조!!
			if (prime(nums[index]) > 0) { // nums 배열에 저장된 정수들 중에서 prime 수 들만 Consol 에 출력
				System.out.println(nums[index]);
			}
		}
	}
}
