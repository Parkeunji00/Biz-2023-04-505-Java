package com.callor.scanner.exec;

import com.callor.scanner.service.PrimeServiceV1;

public class ScannerC {
	public static void main(String[] args) {
		PrimeServiceV1 pService = new PrimeServiceV1();

		while (true) {
			int num = pService.getNum(); // 메쏘드 호출
			if (num < 0) {
				break;
			}
			

			int result = pService.primeYesNo(num);
			if (result > 0) {
				System.out.println("소수");
			} else {
				System.out.println("소수아님");
			}

		}

	}

}
