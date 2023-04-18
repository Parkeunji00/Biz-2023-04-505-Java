package com.callor.controller;

public class ControllerE {

	public static void main(String[] args) {
		for (int i = 0;i < 100;i++) {
		int intScore = (int) (Math.random() * 50) + 51;
//		if (intScore < 51 || intScore > 100) {
	    if ( ! (intScore >= 51 && intScore <= 100) ){
	    	System.out.println(intScore);
		}
	    else {
	    	System.out.println(intScore);
	    }
		}
		System.out.println("Test End");
		
		int num1 = 100;
		int num2 = 100;
		if(++num1 > 100 || ++num2 > 100) {
			System.out.println("OK");
		}
		if(--num1 > 100 && --num2 > 100) {
			System.out.println("Hello");
			// or 둘중 하나가 달라도 실행됌
			// and 둘중 하나가 다르면 실행이 안됌
		}
	}
}
