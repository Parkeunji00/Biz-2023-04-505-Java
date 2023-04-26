package com.callor.classes.service;

import com.callor.classes.model.ScoreDto;

public class ScoreServiceA {
	public void scorePrint(ScoreDto score) {
		System.out.printf("%s\t",score.scNum);
		System.out.printf("%s\t", score.scName);
		System.out.printf("%s\t",score.scKor);
		System.out.printf("%s\t",score.scEng);
		System.out.printf("%s\t",score.scEng);
		System.out.printf("%s\t",score.getTotal());
		System.out.printf("%s\n",score.getAvg());
		
	}

	public int getScore() {
		int score = (int) (Math.random() * 50) + 51;
		return score;
	}

}
