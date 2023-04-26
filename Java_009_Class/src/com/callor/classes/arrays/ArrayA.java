package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;

public class ArrayA{
	public static void main(String[] args) {
		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();
		
		홍길동.scName = "홍길동";
		홍길동.scNum = "0001";
		홍길동.scKor = 90;
	    홍길동.scMath = 80;
	    홍길동.scEng = 85;
	    
	    이몽룡.scName = "이몽룡";
	    이몽룡.scNum = "0002";
	    이몽룡.scKor = 88;
	    이몽룡.scMath = 95;
	    이몽룡.scEng = 81;
	    
	    성춘향.scName = "성춘향";
	    성춘향.scNum = "0003";
	    성춘향.scKor = 91;
	    성춘향.scMath = 85;
	    성춘향.scEng = 93;
	    
	    
	    System.out.println(" 학번 이름 국어 영어 수학 총점 평균");
	    System.out.println("------------------------------------");
	    System.out.println(홍길동.scName + 홍길동.scNum + 홍길동.scKor + 홍길동.scMath + 홍길동.scEng); 
		
	}
		
		
	
	

}
