package com.callor.controller;

public class ControllerD {
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) { // 100개 랜덤수 생성
			int rndNum = (int) (Math.random() * 50) + 51; // 51~100 범위의 랜덤수
			int index; // index 는 나누는 용도(소수를 판별하기 위해서)
			for (index = 2; index < rndNum; index++) { // 소수를 판별하기 위해 index 값을 올림
				if (rndNum % index == 0) { // 소수가 아니면 for문을 빠져나옴
					break;
				}
			}
			if (index >= rndNum) {
				System.out.println(rndNum + " 소수이다 "); // for 문을 빠져나왔을 때의 index 값이 rndNum 보다 크거나 같으면
				// for 문을 다 돌고도 나머지가 0으로 나눠지는 수를 찾지 못했다는 의미 = 소수임

			} else { // index 값이 rndNum 보다 작으면 중간에 빠져나왔다는 의미로
						// 나머지가 0으로 나눠지는 값이 있다는 의미 = 소수아님
				System.out.println(rndNum + " 소수가 아님 ");
			}
		}
	}

}
