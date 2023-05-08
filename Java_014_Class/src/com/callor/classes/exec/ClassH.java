package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassH {
	public static void main(String[] args) {
		// java 1.7 이후 버전에서는 생성자에는 Generic 을 생략해도 된다
		List<Integer> numList = new ArrayList<>(); // 정수형 List 객체변수 numList 선언, 초기화
		

		for (int i = 0; i < 10; i++) {
			int rndNum = (int) (Math.random() * 51) + 50; // 51 ~ 100 까지의 임의의 랜덤수 10개 생성
			numList.add(rndNum); // numList에 rndNum 추가
		}
		for (int i = 0; i < numList.size(); i++) {
			for (int j = i + 1; j < numList.size(); j++) { // 오름차순 정리
				if(numList.get(i) > numList.get(j)) {
					int num = numList.get(i);
					numList.set(i, numList.get(j));
					numList.set(j, num);
				}
				// List type 의 객체변수에는 toString() method 가 포함되고
				// 단순히 List 의 값들을 출력해 볼 수 있다.
				System.out.println(numList.toString());
				
			

			}
		}
	}

}
