package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class HomeWorkB {
	public static void main(String[] args) {

		// 문자열 (String class type 배열 10개 선언
		String[] names1 = new String[10];
		// DB로 부터 가져온 데이터,
		// 키보드 등으로 프로젝트가 실행되는 중에 생성ㅇ된 데이터를
		// 배열에 저장하는 방법
		names1[0] = "홍길동";
		names1[1] = "이몽룡";
		names1[2] = "성춘향";
		names1[3] = "장보고";
		names1[4] = "임꺽정";
		names1[5] = "김철수";
		names1[6] = "김희경";
		names1[7] = "이기동";
		names1[8] = "박철수";
		names1[9] = "한동후";
		
		String[] names = {"홍길동", "이몽룡", "성춘향", "장보고", "임꺽정","김철수","김희경", "이기동","박철수","한동후"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "\t");
		}
		System.out.println();
		
		ScoreDto[] scores = new ScoreDto[names.length];
		
		for (int index = 0; index < scores.length; index++) {
			scores[index] = new ScoreDto();
		}
		
		ScoreServiceA scServiceA = new ScoreServiceA();
		
		System.out.println("=".repeat(70));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총정\t평균");
		System.out.println("-".repeat(70));
		for(int index = 0; index < scores.length; index++) {
			
			scores[index].scName = names[index];   
			
			scores[index].scNum = (index+1)+" ";
			
			scores[index].scKor = scServiceA.getScore();
			scores[index].scEng = scServiceA.getScore();
			scores[index].scMath = scServiceA.getScore();
		}
		
	    for (int i = 0 ; i < scores.length; i++) {
	    	scServiceA.scorePrint(scores[i]);
	    }
	    
	    
	    	
	
		
				

	}
}
