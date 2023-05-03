package com.callor.system.service;

import java.util.Scanner;

import com.callor.scanner.models.StudentDto;

public class StudentServiceV1 {

	public void inputstudent() {
		StudentDto Std = new StudentDto();
		Scanner scan = new Scanner(System.in);

		System.out.println("학생 정보를 입력하세요");
		System.out.println("학번 >>");
		String stNum = scan.nextLine();
		Std.setStNum(stNum);

		System.out.println("이름 >>");
		String stName = scan.nextLine();
		Std.setStName(stName);

		System.out.println("학과 >>");
		String stDept = scan.nextLine();
		Std.setStDept(stDept);

		System.out.println("학년 >>");
		String stGrade = scan.nextLine();
		int intGrade = 0;
		try { intGrade = Integer.valueOf(stGrade);
		    
		} catch (Exception e) {
			System.out.println("학년은 정수로만 입력하세요");
			// TODO: handle exception
		}
		if(intGrade < 1 || intGrade > 4) {
			System.out.println("학년은 1 ~ 4 범위에서 입력하세요");
		}
		
		System.out.print("전화번호 >>");
		String stTel = scan.nextLine();
		
		
		
		System.out.println(Std.toString());
	}
	
	
	
}
