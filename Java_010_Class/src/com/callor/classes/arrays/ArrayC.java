package com.callor.classes.arrays;

public class ArrayC {
	public static void main(String[] args) {
		int[] nums = new int[45]; // 정수형 배열 nums 를 선언하고 요소 45개를 생성
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1; // nums 배열의 0~44 index에 1~45까지를 저장
		}

		for (int i = 0; i < 1000; i++) { // nums 배열에 저장된 값을 무작위로 섞는 연산을 1000번 수행
			int index1 = (int) (Math.random() * nums.length); // 0~44까지의 랜덤수 저장
			int index2 = (int) (Math.random() * nums.length);

			int _tmp = nums[index1]; // nums[index1]의 값을 int_tmp 에 저장
			nums[index1] = nums[index2]; // nums[index2] 의 값은 nums[index1] 의 값이 된다
			nums[index2] = _tmp; // nums[index2]의 값은 _tmp 에 저장된 nums[index1] 의 값이 된다
		}
		for (int i = 0; i < 5; i++) { // nums 배열의 0~5번 요소를 Consol에 출력
			System.out.printf("%d \t", nums[i]);
		}
		System.out.println();

		int[] lotto = new int[6]; // 0~6번 배열의 요소를 생성

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = nums[i];
		}
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int k = i + 1; k < lotto.length; k++) {
				if (lotto[i] > lotto[k]) {
					int _tmp = lotto[i];
					lotto[i] = lotto[k];
					lotto[k] = _tmp;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {

			System.out.printf("%d\n", lotto[i]);
		}
	}
}
