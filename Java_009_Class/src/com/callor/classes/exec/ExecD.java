package com.callor.classes.exec;

public class ExecD {
	public static void main(String[] args) {

		int[] nums = new int[10]; // 정수형 배열에 저장공간 10개 만들기
		for (int index = 0; index < 10; index++) { //
			nums[index] = (int) (Math.random() * 50) + 51; // 51~100 개의 정수를 nums[index] 에 저장

		}
		// 의 배수 찾기
		for (int index = 0; index < 10; index++) {
			if (nums[index] % 5 == 0) { // 저장된 수 중에서 5의 배수만 찾아서 Consol 에 출력 
				System.out.println(" 5의 배수 : " + nums[index]);
			}
		}

	}

}
