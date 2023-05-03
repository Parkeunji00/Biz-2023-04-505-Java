package com.callor.system.service;

import java.util.Scanner;

import com.callor.scanner.models.StudentDto;

public class StudentServiceV2 {
	StudentDto[] stList = new StudentDto[5];

	public void inputStudents() {

		for (int i = 0; i < stList.length; i++) { 
			stList[i] = new StudentDto(); // 배열을 초기화
		}

		

		for(int i = 0; i < stList.length; i++) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("학생정보를 입력하세요");
			System.out.println("학번 >>");
			String stNum = scan.nextLine();
	
			
			System.out.println("학년 >>");
			String stGrade = scan.nextLine();
		}

	}

	public void printStudents() {
		
		
			
			System.out.printf("=".repeat(70));
			System.out.printf("학번\t이름\t학과\t학년\t전화번호");
			System.out.println();

		}
	}
