package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class HomeWork {
	public static void main(String[] args) {
		ScoreDto[] scores = new ScoreDto[10];
		for (int index = 0; index < scores.length; index++) {
			scores[index] = new ScoreDto();
		}
		
		
		scores[0].scName = "홍길동";
		scores[0].scNum = "0001";
		scores[0].scKor = 86;
		scores[0].scMath = 79;
		scores[0].scEng = 76;

		scores[1].scName = "이몽룡";
		scores[1].scNum = "0002";
		scores[1].scKor = 100;
		scores[1].scMath = 77;
		scores[1].scEng = 64;

		scores[2].scName = "성춘향";
		scores[2].scNum = "0003";
		scores[2].scKor = 77;
		scores[2].scMath = 82;
		scores[2].scEng = 89;

		scores[3].scName = "장보고";
		scores[3].scNum = "0004";
		scores[3].scKor = 77;
		scores[3].scMath = 86;
		scores[3].scEng = 89;

		scores[4].scName = "임꺽정";
		scores[4].scNum = "0005";
		scores[4].scKor = 79;
		scores[4].scMath = 67;
		scores[4].scEng = 70;

		scores[5].scName = "김철수";
		scores[5].scNum = "0006";
		scores[5].scKor = 78;
		scores[5].scMath = 53;
		scores[5].scEng = 51;

		scores[6].scName = "김희경";
		scores[6].scNum = "0007";
		scores[6].scKor = 88;
		scores[6].scMath = 99;
		scores[6].scEng = 76;

		scores[7].scName = "이기동";
		scores[7].scNum = "0008";
		scores[7].scKor = 86;
		scores[7].scMath = 79;
		scores[7].scEng = 76;

		scores[8].scName = "박철수";
		scores[8].scNum = "0009";
		scores[8].scKor = 86;
		scores[8].scMath = 59;
		scores[8].scEng = 78;

		scores[9].scName = "한동후";
		scores[9].scNum = "0010";
		scores[9].scKor = 88;
		scores[9].scMath = 89;
		scores[9].scEng = 75;
		
		System.out.println("==================================");
		System.out.println("학번\t이름\t국어\t수학\t총점\t평균");
		System.out.println("----------------------------------");
	    ScoreServiceA SvA = new ScoreServiceA(); 
		for(int i = 0; i < 10; i++) {
		
			SvA.scorePrint(scores[i]);
			
			
		}
		

	}

}
