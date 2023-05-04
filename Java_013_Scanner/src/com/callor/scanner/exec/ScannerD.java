package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerD {
	public static void main(String[] args) {
		while (true) {

			int rndNum = (int) (Math.random() * 10) + 1; // 1~10 까지 랜덤수 생성하여 변수에 저장
			Scanner scan = new Scanner(System.in); // Scanner 클래스를 사용하여 키보드로 입력받기

			String inputNum = "";

			while (true) {
				System.out.println("숫자를 맞춰봐(QUIT 종료 :");
				inputNum = scan.nextLine(); // 문자열로 입력받는 것
				if (inputNum.equals("QUIT")) {
					return;
				}
				int intNum = Integer.valueOf(inputNum); // inputNum를 정수형으로 바꿈

				if (intNum == rndNum) {
					System.out.println("잘했어요");
					break;
				}
			}

		}
	}

}
