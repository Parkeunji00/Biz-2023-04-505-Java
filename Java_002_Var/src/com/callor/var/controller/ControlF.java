package com.callor.var.controller;

public class ControlF {
	public static void main(String[] args) {
		int intRnd = (int)(Math.random() * 10) + 1;
		if(intRnd % 3 == 0) {
			int intResult = intRnd * 3;
			System.out.println(intResult);
		} else { 
			System.out.println(intRnd + "은(는) 3의 배수가 아님");
		}
		/*
		 * intResult 변수는 if() {} 의 scope 를 갖는다
		 * = if {  } block 내부에서만 생명을 유지한다
		 * 즉, of() {  } 을 벗어나면 intResult 변수는
		 * 참조(읽기, 스기(할당)) 할수 없다
		 */
		
	}

}
