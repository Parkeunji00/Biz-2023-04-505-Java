package com.callor.classes.config;

public class Line {
	/*
	 * 코드에서 라인 그리기 코드를 자주 사용해야 할 것으로 예상되어
	 * 미리 static 변수와, static method 로 생성해 두고
	 * 필요할때 호출하여 사용한다
	 */

	public static final String dLine = "=".repeat(60);
	public static final String sLine = "-".repeat(60);
	
	public static final String dLine( int length) {
		
		return "=".repeat(length);
	}
public static final String sLine( int length) {
		
		return "-".repeat(length);
	}

}
