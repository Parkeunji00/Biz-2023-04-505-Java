package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.Service.ScoreServoceV1;
import com.callor.classes.models.ScoreDto;
/*
 * 일반벅인 변수(primitive) 는 method 의 매개변수로 전달할때
 * 변수 자체가 전달되는 것이 아니고 변수의 값(데이터)만 전달된다
 * 매개변수로 전달받은 method 에서 아무리 변수의 값을 변경해도
 * 실제값은 변경되지 않는다
 */
public class ScoreB {
	public static void main(String[] args) {
		// ScoreDto type 의 데이터 요소를 저장할 scoreList 리스크 객체 생성
		List<ScoreDto> scList = new ArrayList<>();
		
		ScoreServoceV1 scService = new ScoreServoceV1();
		
		scService.makeScore(scList);
		// System.out.println(scList.toString());
		scService.printScore(scList);
		
		
		int num1 = 100;
		int num2 = 200;
		// scService 의 add method 에게 변수값 전달하기
		// num1, num2 에 저장된 값이 전달된다 변수가 전달되는게 아니다.
		
		scService.add(num1, num2);
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
