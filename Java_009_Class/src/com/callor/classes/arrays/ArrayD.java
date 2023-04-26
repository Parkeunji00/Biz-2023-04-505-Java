package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class ArrayD {
	/*
	 * class type 의 객체(변수) 배열 만들기 className object = new ClassName[10] class type 의
	 * 배열은 일반 변수 배열과 달리 즉시 사용할 수 없다. 동시에 초기화 되지 않는다 별도로 배열요소를 초기화 시키는 코드가 필요하다
	 */
	public static void main(String[] args) {
		// ScoreDto type 요소 10개 갖는 배열 선언
		ScoreDto[] scores = new ScoreDto[10];
		
		// class type 의 배열 요소 전체를 객체 요소로 생성하기
		for(int index = 0 ; index < scores.length ; index++) {
			scores[index] = new ScoreDto();
			
		
		}
		ScoreServiceA scoreService = new ScoreServiceA();
		  
		
	}

}
