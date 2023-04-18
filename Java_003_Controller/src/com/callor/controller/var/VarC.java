package com.callor.controller.var;

public class VarC {
	public static void main(String[] args) {
		String str = "ABC";
		// Sring은 class String은 값이 저장되는게 아니라 주소가 저장된다
		// 실제값이 저장되어있는 기억장소의 주소
		// 사용하지 않는 기억장소는 비워줌(GC)가베지컬렉션
		System.out.println(str);
		str = "Korea";
	    str = "대한민국";
		str = "우리나라";
		System.out.println(str);
		// 3개의 문자열을 연결하여 str 변수에 저장
		str = "Republic" + "of" + "Korea";
		System.out.println(str);
	}

}
