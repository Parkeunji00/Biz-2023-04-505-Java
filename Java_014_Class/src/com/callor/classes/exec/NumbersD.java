package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class NumbersD {
	public static void main(String[] args) {
	 // numList 데이터를 무작위 순서로 섞기
	// 0 ~ 5번 index까지 출력하기
	List<Integer> numList = new ArrayList<>(); // 정수형 List 객체변수 numList로 초기화
	for(int i = 0; i < 45; i++) {
		numList.add(i+1);
			
		}
	for(int i = 0; i < 1000; i++) {
		
		// List shuffle 하기
		int num1 = (int)(Math.random() * numList.size()); // 1 ~ 45까지 랜덤수 생성
		int num2 = (int)(Math.random() * numList.size());
		numList.add(num1, num2); // 1 ~ 45 까지 연속된 정수를 numList 에 추가
		int temp = numList.get(num1);
		numList.set(num1, numList.get(num2));
		numList.set(num2, temp);
		
		
		
	}
	

}
}


