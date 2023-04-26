package com.callor.classes.exec;

public class ExecE {
	public static void main(String[] args) {
		
		/*
		 * 배열 요소의 생성 개수는 그때 그때 상황에 따라 다르다
		 * 배열의 요소를 대상으로 for() 반복문으로 처리르 할때
		 * 배열의 요소의 개수를 일일이 숫자로 코딩하는 것은
		 * 배열 요소의 개수가 변경 될때마다 수정해야 하는
		 * 코드 부분이 많아진다는 것
		 * 그래서 Java 에서는 배열을 생성하면
		 * 배열의 요소 개수를 알수 있는 변수를 자동으로 생성한다
		 * 배열.length
		 */

		int[] nums = new int[22]; // 정수형 배열에 저장공간 10개 만들기
		for (int index = 0; index < nums.length; index++) { 
			nums[index] = (int) (Math.random() * 50) + 51; // 51~100 개의 정수를 nums[index] 에 저장

		}
		
		// 의 배수 찾기
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] % 5 == 0) { // 저장된 수 중에서 5의 배수만 찾아서 Consol 에 출력 
				System.out.println(" 5의 배수 : " + nums[index]);
			}
		}
	}

}
