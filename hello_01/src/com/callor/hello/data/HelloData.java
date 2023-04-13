package com.callor.hello.data;

public class HelloData {

	public static void main(String[] args) {
		System.out.println("Hello Korea");
		System.out.println("Hello" + "Korea");
		System.out.println("Hello       Korea");
		System.out.println("Hello"     +      "Korea");
		
        System.out.println(30 + 40); // 산술연산 // 70
        System.out.println("30" + "40"); // 문자열 연산 //3040
        System.out.println("30 + 40"); //30 + 40
        
        // 30 + 40 = 70
        System.out.println("30 + 40 = 70"); //30 + 40 = 70
        System.out.println("30 + 40 = " + 30 + 40); //30 + 40 = 3040
        // "30 + 40" + 30 을 연산하려고 시도
        // 이 연산은 문자열 + 숫자 의 연산이다
        // 이럴때는 숫자 데이터인 30을 문자열 30으로
        // 바꿔 버린다
        System.out.println("30 + 40 = " + "30" + 40);
        System.out.println("30 + 40 = 30" + 40);
        System.out.println("30 + 40 = " + "30" + "40");
        System.out.println("30 + 40 = " + (30 + 40));
        System.out.println("30 + 40 = " + 30 + 40);
        System.out.println("30 x 40 = " + 30 * 40);
        // 문자열은 +(연결연산자)만 가능하다
        // System.out.println("30 - 40 = " = 30 - 40);
        // 문자열과 숫자는 - 할 수 없다
        // System.out.println("30" - "40");
        // System.out.println("30" * "40");
        // System.out.println("30" / "40");
        
        System.out.println("30" + "40");
	}
}
