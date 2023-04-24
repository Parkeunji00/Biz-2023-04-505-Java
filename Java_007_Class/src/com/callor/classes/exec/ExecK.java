package com.callor.classes.exec;

import com.callor.classes.module.ServiceB;

public class ExecK {
	public static void main(String[] args) {
		String name = "홍길동"; // 학생이름:홍길동
		int korea = (int) (Math.random() * 50) + 51; // 과목점수 51 ~ 100 범위의 랜덤수
		int math = (int) (Math.random() * 50) + 51;
		int english = (int) (Math.random() * 50) + 51;

		ServiceB SvB = new ServiceB(); // Survice B 호출
		SvB.scorePrint(name, korea, math, english);
	}
}
