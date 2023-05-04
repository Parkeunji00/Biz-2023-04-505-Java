package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerB {
	// 매개변수를 통하여 전달받은 num 변수의 값이
	// prime 이 아니면 -1 을 return, prime 이면 num 변수의 값을 return
	public static void main(String[] args) {
		// Scanner 클래스를 사용하여 scan 객체변수 생성
		// 키보드에서 임의의 정수를 입력받고
		// 입력받은 정수가 소수(prime) 인가를 판별하여 출력
		Scanner scan = new Scanner(System.in); // scan 객체변수 생성
		int num = 10;
		int index = 0;
		int intNum = scan.nextInt(); // 키보드에서 임의의 정수를 입력받고
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;
			}
		}

		// for() 반복문이 끝났을때
		// num가 소수와 num가 소수가 아닌경우
	}
}
