package com.callor.classes.exec;

public class ExecC {
	// 배열 생선(선언과 초기화가 된 상태)
	public static void main(String[] args) {

		int[] nums = new int[10];
		// 생성된 배열 요소에 값 채워넣기
		// 데이터 수집
		for (int index = 0; index < 10; index++) {
			nums[index] = (int) (Math.random() * 50) + 51; // 51 ~ 100 까지의 랜덤수를 num[index] 에 저장

		}
		
        // 배열 요소에 채워진 값들의 전체를 합산
		// 데이터 처리
		int sum = 0; // 정수들의 합을 저장할 변수
		for (int index = 0; index < 10; index++) {
			sum += nums[index];

		}

		System.out.println(sum);
	}
}
