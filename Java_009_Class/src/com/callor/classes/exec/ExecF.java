package com.callor.classes.exec;

public class ExecF {
	public static void main(String[] args) {

		int[] nums = new int[10]; // 정수형 배열에 저장공간 10개 만들기
		for (int index = 0; index < nums.length; index++) {
			nums[index] = (int) (Math.random() * 50) + 51; // 51~100 개의 정수를 nums[index] 에 저장
		}
		// 배열의 요소에 저장된 값중에서 최초로 5의 배수가 저장된
		// 위치 찾기
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] % 5 == 0) { // 5의 배수 구하기
				System.out.println("최초 5의 배수 위치" + index + " 5의 배수값 : " + nums[index]); 
				break;
			}
		}
	}
}
