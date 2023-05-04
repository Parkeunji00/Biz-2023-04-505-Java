package com.callor.scanner.exec;

import java.util.Scanner;
// 랜덤수를 맞추는 게임
public class ScannerF {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 키보드를 통해서 입력받는 것
		int[] nums = new int[6]; // 6개의 정수를 만든다
		String strNum = ""; // 입력을 받을 문자열 변수
		int num = 0; // 값을 비교할것을 선언, 
		// 입력을 받은 값(strNum)을 정수형으로 바꿔서 num에 저장

		while (true) { // 1번째 

			System.out.println("=".repeat(30));
			System.out.println("숫자를 맞춰봐(싫으면 QUIT)");
			int rndNum = (int) (Math.random() * 10) + 1; // 1 ~ 10까지의 랜덤수 생성

			while (true) { // 2번째
				System.out.print(">> "); 
				strNum = scan.nextLine(); // 문자열을 키보드로 입력받기

				if (strNum.equals("QUIT")) { // strNum에 저장된 값이 QUIT이면
					System.out.println("GAME OVER"); // 이게 출력
					return; // 종료가 되면 return 되어서 main method 를 나감
				}

				try { // try catch 는 오류가 났을 때 실행하는 것(5d 이런것)
					//오류가나면 try catch 안에 있는 정수가 아니잖아가 출력
					num = Integer.valueOf(strNum); // 문자열을 정수형으로 받기
					if (num < 1 || num > 10) { // num이 1보다 작거나 num이 45보다 크면
						System.out.println("1 ~ 10까지야");
						continue;
					} else if (num == rndNum) { // num과 rndNum의 값이 같으면
						System.out.println("참 잘했어요 :)");
						break; //빠져나옴
					} else if (num > rndNum) { // num이 rndNum 값보다 크면
						System.out.println("너무 커");
					} else if (num < rndNum) { // num이 rndNum 값보다 작으면
						System.out.println("너무 작아");
					}

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("정수가 아니잖아");
					continue; // 2번째 while문 >>로 가서 다시 입력
				}

			
			}
			System.out.println();
		}
	}
}
