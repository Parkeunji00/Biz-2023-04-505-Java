package com.callor.controller;

public class ControllerF {

	/*
	 * prime() method 의 코드를 수정하여 생성된 랜덤수가 소수인지 아닌지 판별하는 코드로 변경
	 * 
	 * void type 의 prime() method 를 boolean type 의 prime() method 로 변경
	 * 
	 * method 를 선언할때 void type 이외의 type 으로 선언하면 method {} 내에서 반드시 return 명령문이 있어야
	 * 한다.
	 */

	public static boolean prime() {
		int rndNum = (int) (Math.random() * 50) + 51; // 51~100 범위의 랜덤수
		int index; // index 는 나누는 용도(소수를 판별하기 위해서)
		for (index = 2; index < rndNum; index++) { // 소수를 판별하기 위해 index 값을 올림
			if (rndNum % index == 0) { // 소수가 아니면 for문을 빠져나옴
				break;
			}
		}

		boolean yesPrime = rndNum <= index; // rndNum 가 소수이냐 아니냐 true, false
		return yesPrime;

		// if (index >= rndNum) {
		// System.out.println(rndNum + " 소수이다 "); // for 문을 빠져나왔을 때의 index 값이 rndNum 보다
		// 크거나 같으면
		// for 문을 다 돌고도 나머지가 0으로 나눠지는 수를 찾지 못했다는 의미 = 소수임

		// } else { // index 값이 rndNum 보다 작으면 중간에 빠져나왔다는 의미로
		// 나머지가 0으로 나눠지는 값이 있다는 의미 = 소수아님
		// System.err.println(rndNum + " 소수가 아님 ");
	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) { // 100개 랜덤수 생성
			// prime() method 의 {} 내의 코드를 실행해달라
			// prime() method 를 호출한다 라고 표현
			if (prime()) {
				System.out.println("소수");
			} else {
				System.err.println("소수아님");
			}
		}
	}
}
