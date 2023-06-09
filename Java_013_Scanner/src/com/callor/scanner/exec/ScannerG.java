package com.callor.scanner.exec;

import java.util.Scanner;

// 랜덤수를 맞추는 게임
public class ScannerG {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lottoGameNums = 45;

		// 정수형 배열 6개를 만들어라
		// 정수형 요소 6개를 갖는 nums 배열 생성
		int[] nums = new int[6];
		int numsSaveIndex = 0; // nums 의 "어느 위치"를 알려줄 변수

		// nums 배열 요소에 한번도 저장되지 않은 rndNum 값 찾기(만들기)
		while (true) {
			int rndNum = (int) (Math.random() * lottoGameNums) + 1;

			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == rndNum) {
					rndNum = (int) (Math.random() * lottoGameNums) + 1;
					i = -1;
				}
			}

			System.out.println(rndNum);
			// 여기에 도달하면 rndNum 는 중복되지 않은 랜덤수
			while (true) {
				System.out.print("정수 입력(QUIT : 종료) >> ");
				String strNum = scan.nextLine();
				if (strNum.equals("QUIT")) {
					System.out.println("게임을 중단");
					return;
				}
				int intNum = 0;
				try {
					intNum = Integer.valueOf(strNum);
				} catch (Exception e) {
					System.out.println("입력값 오류!!");
					System.out.println("정수만 입력하세요!!");
					continue;
				}

				if (intNum < 0 || intNum > 45) {
					System.out.println("1 ~ 45 범위의 정수 값을 입력하세요");
				} else if (rndNum == intNum) {
					System.out.println("참 잘했어요");
					// nums 배열의 "어느 위치"에 rndNum를 저장해야 한다.
					nums[numsSaveIndex++] = rndNum;
					break;
				} else if (rndNum > intNum) {
					System.err.printf("%d, 입력값이 작아요\n", intNum);
				} else if (rndNum < intNum) {
					System.err.printf("%d, 입력삾이 커요\n", intNum);
				}

			} // 숫자 맞추기 while
				// 참잘했어요 break 를 만났을때 진행 곳
			if (numsSaveIndex >= nums.length) {
				break;
			}
		} // 1st while
		System.out.println("GAME OVER!!");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d\t", nums[i]);
		}
		System.out.println();
	}
}
