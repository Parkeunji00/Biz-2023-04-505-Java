package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.ScoreDto;

// 리스트에 10명의 성적 리스트를 추가
// 학번은 "00001" ~ "0010"
// 각 과목 점수는 51 ~ 100 까지 임의의 정수
// makeScore() method 에 매개변수로 List 데이터를 전달하여 성적리스트를 만드는 방법
// ScoreServiceV1 에 List 를 선언하고, 성적리스트를 만드는 방법
public class ScoreServiceV2 {
	
	public void makeScoreV2(List<ScoreDto>scList) {
		   for(int i = 0; i < 10 ; i++) {
		    	// 0001~0010 까지 학번만들기
		    	// 3과목의 점수 생성하기
		    	
		    	String stName = String.format("%04d", i + 1);
		    	// 학번과 점수를 ScoreDto 객체변수를 만들어 저장하기
		    	//
		    	ScoreDto stdDto = new ScoreDto();
				int scKor = (int) (Math.random() * 50) + 51;
				int scEng = (int) (Math.random() * 50) + 51;
				int scMath = (int) (Math.random() * 50) + 51;
				
				
				stdDto.setStName(stName); // set 은 데이터를 저장
				stdDto.setScKor(scKor);
				stdDto.setScEng(scEng);
				stdDto.setScMath(scMath);
				
				// ScoreDto 객체변수를 List에 추가하기
				stList.add(stdDto);
				
		    }
	}
		// scoreList 변수를 ScoreServiceV2 클래스의
		// 다른 method 에서 사용하기 위하여
		// 클래스 영역으로 scope 를 이동한다
		// 클래스 영역으로 scope 가 이동된 객체변수는 
		// 선언만 수행한다.
		// 선언만 수행된 객체변수는 사용하려고 하면 오류가 
		// 발생할 수 있다
		// makeScore() method 가 시작되는 곳에서 scoreList 를
		// 초기화(생성) 해 주어야 한다
		private	List<ScoreDto> stList ; // List 에 담기 // 객체변수 선언
		public void makeScore() {
		
		// scoreList 변수의 scope 가 makeScore() {} 블럭마다
		// 만약 다른 method 에서
		// scoreList 변수값을 사용하려면
		// scopr 영역을 변경해 주어야 한다
		stList = new ArrayList<>(); // 객체변수 초기화
		this.makeScoreV2(stList);
		
		/*
	    for(int i = 0; i < 10 ; i++) {
	    	// 0001~0010 까지 학번만들기
	    	// 3과목의 점수 생성하기
	    	
	    	String stName = String.format("%04d", i + 1);
	    	// 학번과 점수를 ScoreDto 객체변수를 만들어 저장하기
	    	//
	    	ScoreDto stdDto = new ScoreDto();
			int scKor = (int) (Math.random() * 50) + 51;
			int scEng = (int) (Math.random() * 50) + 51;
			int scMath = (int) (Math.random() * 50) + 51;
			
			
			stdDto.setStName(stName); // set 은 데이터를 저장
			stdDto.setScKor(scKor);
			stdDto.setScEng(scEng);
			stdDto.setScMath(scMath);
			
			// ScoreDto 객체변수를 List에 추가하기
			stList.add(stdDto);
			
			
		
		   
*/
	    	
	    }
//	    System.out.println(stList);
		
		
	}


