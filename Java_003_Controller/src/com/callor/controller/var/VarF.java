package com.callor.controller.var;

public class VarF {
	public static void main(String[] args) {
		String str = "Republic of Koreafjdksljglagjklajgkldierjl;";
		char cVar = str .charAt(3);
		// At는 R(0)부터 3번째인 u를 출력
		System.out.println(cVar);
		System.out.println(str.length());
		
		for(int i = 0 ; i < str.length() ; i++) {
	    System.out.print(str .charAt(i) + "\t");
		}
	}

}
