package com.callor.controller;

public class ControllerB {
	public static void main(String[] args) {
		int intRnd = (int) (Math.random() * 50) + 51;
		// i fmf 2 ~ 자신 -1 까지 연속된 정수를
		// 만들어 내는 코드
		int primeCount = 0;
		for (int i = 2; i < intRnd; i++) {
			if (intRnd % i == 0) {
				//System.out.println(intRnd + "소수가 아님");
				primeCount ++;
				break;
			}
		}
		if ( primeCount > 0) {
			System.out.println(intRnd + " 는 소수가 아님 ");
		} else {
			System.out.println(intRnd + " 는 소수 ");
			
		}
		if(primeCount == 0) {
			System.out.println(intRnd + " 는 소수 ");
		} else {
			System.out.println(intRnd + " 는 소수가 아님 ");
		}
		
		boolean isPrime = true;
		for(int i = 0; i < intRnd ; i++) {
			if(intRnd % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(intRnd + "소수임");
		}else {
			System.out.println(intRnd + "소수아님");
		}
		}
}
