package com.callor.classes.exec;

// 정수형 nums 배열 10개를 생성(정수형 요소 10개인 배열 생성)
public class ClassA {
	public static void main(String[] args) {
		// 정수형 배열 10개 생성
		int nums[] = new int[10];
		// 개별요소 ( 0번요소) 에 값 저장
		nums[0] = (int) (Math.random() * 51) + 50;
		// 정수형 배열 10개의 요소에 51 ~ 100까지 랜덤수 저장
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 51) + 50;
		}
		// nums 배열에 저장된 정수 중에서 처음으로 짝수가 저장된 요수의 index와 값을 출력
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				System.out.println(nums[i]);
				break;
			}
		}
	}

}
