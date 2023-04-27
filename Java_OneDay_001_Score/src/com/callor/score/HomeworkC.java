package com.callor.score;

import com.callor.classes.modul.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class HomeworkC {
	public static void main(String[] args) {

		int[] names = new int[10];
		
		ScoreDto[] scores = new ScoreDto[names.length];

		for (int index = 0; index < scores.length; index++) {
			scores[index] = new ScoreDto();
		}

		ScoreServiceA scServiceA = new ScoreServiceA();

		System.out.println("=".repeat(70));
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		System.out.println("-".repeat(70));
		for (int index = 0; index < scores.length; index++) {
			

			scores[index].scNum = ("23001");
			scores[index].scKor = scServiceA.getScore();
			scores[index].scEng = scServiceA.getScore();
			scores[index].scMath = scServiceA.getScore();
			scores[index].scMusic = scServiceA.getScore();
			scores[index].scArt = scServiceA.getScore();
		}

		for (int i = 0; i < scores.length; i++) {
			scServiceA.scorePrint(scores[i]);

		}

	}
}
