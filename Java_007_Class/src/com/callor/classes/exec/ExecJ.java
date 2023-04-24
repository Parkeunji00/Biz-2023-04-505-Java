package com.callor.classes.exec;

import com.callor.classes.module.ServiceA;

public class ExecJ {
	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 50) + 51; // 51~100 까지 랜덤수 저장
		int rndNum2 = (int) (Math.random() * 50) + 51; // 51~100 까지 랜덤수 저장
		ServiceA SvA = new ServiceA(); // 서비스 클래스 객체 생성
		int result;
		result = SvA.add(rndNum, rndNum2); // rndNum1 + rndNum2
		System.out.println(result);
	}
}
