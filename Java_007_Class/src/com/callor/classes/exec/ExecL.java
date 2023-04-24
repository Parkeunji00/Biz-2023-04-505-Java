package com.callor.classes.exec;

import com.callor.classes.module.ServiceC;

public class ExecL {
	public static void main(String[] args) {

		int rndNum = (int) (Math.random() * 10); // 0~9 범위의 랜덤수 생성
		ServiceC SvC = new ServiceC();

		if (rndNum >= 2 && rndNum <= 9) {
			SvC.guguDan(rndNum);
		} else {
			System.out.println("구구단이 아니야");
		}
	}
}
