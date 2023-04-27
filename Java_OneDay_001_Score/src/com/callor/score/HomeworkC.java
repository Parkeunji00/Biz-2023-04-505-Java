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
			scores[index].scNum = String.format("%05d", (index + 23001));
			scores[index].scKor = scServiceA.getScore();
			scores[index].scEng = scServiceA.getScore();
			scores[index].scMath = scServiceA.getScore();
			scores[index].scMusic = scServiceA.getScore();
			scores[index].scArt = scServiceA.getScore();
			
		
		}
		for (int i = 0; i < scores.length; i++) {
			scServiceA.scorePrint(scores[i]);
			 
			
		}
		int KorTotal = 0;
		int EngTotal = 0;
		int MathTotal = 0;
		int MusicTotal = 0;
		int ArtTotal = 0;
		int TotalSum = 0;
		double Avg = 0.0;
		for (int i = 0; i < scores.length; i++) {
		
			
		}
	
		System.out.println("-".repeat(70));
		System.out.println("총점");
		System.out.println();
		System.out.println("평균");
		System.out.println("=".repeat(70));
		
	}
}
