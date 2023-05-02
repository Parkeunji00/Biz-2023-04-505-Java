package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.ScoreServiceV1;

public class ScoreExecV1 {
	public static void main(String[] args) {
		
		// 10 명 학생의 점수를 저장할 객체배열 선언
		ScoreDto[] scoreList = new ScoreDto[10];
		
		// 객체배열 초기화 하기
		for (int i = 0; i < scoreList.length ; i ++ ) {
			scoreList[i] = new ScoreDto();
		}
		
		// ScoreService 에 있는 method 사용하기 위한 준비
		ScoreServiceV1 scService = new ScoreServiceV1();
		
		// 세팅하는 절차
		scService.setScoreList(scoreList);
		// 점수생성하기
		scService.ScoreRndMake();
		/*
		 * ScoreService 의 scoreList 객체 배열을
		 * public 으로 하지 않고 private 로 선언한다
		 * 코드 어디선가 개발가 (작성자)가 예기치 않게
		 * scoerList 데이터가 변경되는 것을 방지하는 목적이다
		 */
		// scService.scoreList = new ScoreDto[100];
		// 점수 리스트 출력하기
		
		scService.scoreListPrint();
		scService.ScoretotalPrint();
		scService.ScoreavgPrint();
	}

}
