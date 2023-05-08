package com.callor.classes.Service;

import java.util.List;

import com.callor.classes.models.ScoreDto;

public class ScoreServoceV1 {
	// 학생수를 10으로 설정하기 위한 변수 선언
	private int classSize = 10;

	/*
	 * 매개변수로 일반 변수가 아닌 참조형 객체 변수를 사용했다 참조형 객체변수는 실제 저장된 값이 전달되는게 아니고 기억장소에 주소가 전달된다
	 * 
	 * main() method 에서 보낼떄 scoreList 의 주소가 전달되고 makeScore() 에서 값을 변경시키면 main()
	 * method 의 scoreList 가 같이 변경되는 성질을 갖게 된다
	 */
	public void makeScore(List<ScoreDto> scoreList) {
		for (int i = 0; i < classSize; i++) {
			// 001,002 형식으로 학번 문자열 만들기
			String stNum = String.format("%03d", i + 1);
			int scKor = (int) (Math.random() * 50) + 51;
			int scMath = (int) (Math.random() * 50) + 51;
			int scMusic = (int) (Math.random() * 50) + 51;
			int scArt = (int) (Math.random() * 50) + 51;

			/*
			 * List type 의 데이터 배열에서는 먼저 배열선언, 배열초기화, 각 요소에 데이터 저장 List type 의 데이터 1. 먼저 비어있는
			 * (blank) List type 을 생성 2. Dto 객체변수 생성 3. Dto 각 변수에 값을 세팅 4. List 에 Dto를 add
			 */
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.setStNum(stNum);
			scoreDto.setScKor(scKor);
			scoreDto.setScMath(scMath);
			scoreDto.setScMusic(scMusic);
			scoreDto.setScMusic(scArt);
			scoreList.add(scoreDto);
		}

	} // makeScore() end

	/*
	 * ================================= 학번 국어 수학 음악 미술
	 * ---------------------------------
	 */

	public void printScore(List<ScoreDto> scList) {
		
		
		System.out.println("=".repeat(70));
		System.out.println("학번\t국어\t수학\t음악\t미술");
		System.out.println("-".repeat(70));
		for (int i = 0; i < scList.size(); i++) {
			System.out.print(scList.get(i).getStNum() + "\t");
			System.out.print(scList.get(i).getScKor() + "\t");
			System.out.print(scList.get(i).getScMath() + "\t");
			System.out.print(scList.get(i).getScMusic() + "\t");
			System.out.print(scList.get(i).getScArt() + "\n");
			System.out.print(scList.get(i).getTotal() + "\n");
		}

	}
	// scList 데이터를 총점을 기분으로 오름차순 정리하기
	public void sortScore(List<ScoreDto> sclist) {
		for(int i = 0; i < sclist.size(); i++ ) {
			for(int j = 0; j < sclist.size(); j++) {
				if(sclist.get(i).getTotal() > sclist.get(j).getTotal()) {
				ScoreDto scDto = sclist.get(i);
				sclist.set(i, sclist.get(j));
				sclist.set(j, scDto);
				
					
					
				}
				
			}
			
		}
		
	}
	public void add(int num1, int num2) {
		num1 = 1000;
		num2 = 2000;
	}

}
