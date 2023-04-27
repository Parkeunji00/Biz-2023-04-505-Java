package com.callor.classes.service;

import com.callor.classes.modul.ScoreDto;

public class ScoreServiceA {
	public void scorePrint(ScoreDto score) {
		System.out.printf("%s\t",score.scNum);
		System.out.printf("%d\t",score.scKor);
		System.out.printf("%d\t",score.scEng);
		System.out.printf("%d\t",score.scMath);
		System.out.printf("%d\t",score.scMusic);
		System.out.printf("%d\t",score.scArt);
		System.out.printf("%d\t",score.getTotal());
		System.out.printf("%4.2f\n",score.getAvg());
		
	}
	public int getScore() {
		int score = (int) (Math.random() * 50) + 51;
		return score;

}
	public void scoreTotalPrint(int Kor, int Eng, int Math, int Music, int Art) {
		System.out.printf("\t");
		System.out.printf("\t");
		System.out.printf("%3d\t", Kor);
		System.out.printf("%3d\t", Eng);
		System.out.printf("%3d\t", Math);
		System.out.printf("%3d\t", Music);
		System.out.printf("%3d\t", Art);
		System.out.printf("%3d\t", Kor + Eng + Math + Music + Art);
		
	}
}
