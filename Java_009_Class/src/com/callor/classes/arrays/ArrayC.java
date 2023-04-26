package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class ArrayC {

	public static void main(String[] args) {
		ScoreServiceA scoreService = new ScoreServiceA();

		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();

		홍길동.scName = "홍길동";
		홍길동.scNum = "0001";
		홍길동.scKor = scoreService.getScore();
		홍길동.scMath = scoreService.getScore();
		홍길동.scEng = scoreService.getScore();

		이몽룡.scName = "이몽룡";
		이몽룡.scNum = "0002";
		이몽룡.scKor = scoreService.getScore();
		이몽룡.scMath = scoreService.getScore();
		이몽룡.scEng = scoreService.getScore();

		성춘향.scName = "성춘향";
		성춘향.scNum = "0003";
		성춘향.scKor = scoreService.getScore();
		성춘향.scMath = scoreService.getScore();
		성춘향.scEng = scoreService.getScore();

		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------");
		scoreService.scorePrint(홍길동);
		scoreService.scorePrint(이몽룡);
		scoreService.scorePrint(성춘향);
		System.out.println("------------------------------------");
		System.out.println();

		int korTotal = 홍길동.scKor + 이몽룡.scKor + 성춘향.scKor;
		int EngTotal = 홍길동.scEng + 이몽룡.scEng + 성춘향.scEng;
		int MathTotal = 홍길동.scMath + 이몽룡.scMath + 성춘향.scMath;
		int total = 홍길동.getTotal() + 이몽룡.getTotal() + 성춘향.getTotal();

		System.out.printf("\t\t%d\t %d\t %d\t %d\t", korTotal, EngTotal, MathTotal, total);
	}
}
