package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.models.StudentDto;

public class StudentServiceImplV2 implements StudentService{
	

	private List<StudentDto> stdList; // stdList 선언
	public StudentServiceImplV2() { // 생성자 생성
		 
	stdList = new ArrayList<>(); // stdList 생성
	
	}
	@Override
	public void loadStudent() {
		String studentFile = "src/com/callor/classes/datas/Student.csv";
		String saveFile = "src/com/callor/classes/datas/Student-save.csv";
		 
		Scanner fileScan = null;
		
		InputStream is = null;
		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StudentDto std = new StudentDto();
		
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStudent() {
		
		System.out.println("=".repeat(70));
		System.out.printf("학번\t이름\t학과\t학년\t전화번호\t주소\n");
		System.out.println("-".repeat(70));
		
	}

	@Override
	public StudentDto getStudent(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
