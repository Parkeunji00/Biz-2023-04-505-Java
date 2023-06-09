package com.callor.score.model;

/*
 * 성적처리를 수행하는데
 * 학번(230001), 국어, 영어, 수학, 음악, 미술, 교과목의
 * 점수를 저장하고
 * 총점, 평균을 계산하는 method 를 선언
 */
public class ScoreDto {
	
	// 각 객체의 데이터를 저장할 변수를 선언하기
	
	public String stNum;
	public int sckor;
	public int scEng;
	public int scMath;
	public int scMusic;
	public int scArt;
	
	// 총점과 평균계산을 위한 method 선언하기
	public int getTotal() {
	int total = this.sckor;
	total += this.scEng;
	total += this.scMath;
	total += this.scMusic;
	total += this.scArt;
	return total;
	}
	/*
	 * 클래스에 선언된 getTotal() method 를 호출하여
	 * 총점을 계산하도록 하고,
	 * 계산된 총점을 float 로 변환하여 평균을 계산하고
	 * 그 결과를 return
	 */
	public float getAvg() {
		float avg = (float)(this.getTotal()) / 5;
		return avg;
		
	}
	
	
	

}
