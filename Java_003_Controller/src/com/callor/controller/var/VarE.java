package com.callor.controller.var;

public class VarE {
	public static void main(String[] args) {
		String str = "Republic of Korea";
		String nation = "";
		
				nation = str.substring(12);
		// str 에 저장된 문자열을 12번째 에서 잘라서
	    // 오른쪽의 문자열을 nation 변수에 저장
		//  substring-문자열을 자르는 것
		// 12번째까지의 문자열을 자름 = 옆에 변수(nation)에 저장
		// Korea만 출력됌
		System.out.println(nation);
		
		System.out.println(str.substring(9,11));
		// 9번째 ~ 11번째까지 자름 of
	    // str 에 저장된 문자열을 9번째에서 한번자르고
	    // 11번째에서 또 한번 자르고 
	    // 그 사이의 문자열을 출력
	}

}
