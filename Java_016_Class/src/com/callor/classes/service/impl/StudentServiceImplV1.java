package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StdData;
import com.callor.classes.models.StudentDto;

public class StudentServiceImplV1 implements StudentService{

	List<StudentDto> stdList = new ArrayList();
	@Override
	public void loadStudent() {
		
		for (int index = 0; index < StdData.STUDENT.length; index++) {

			String[] student = StdData.STUDENT[index].split(","); // StdData.STUDENT 의 문자열을 컴마를 기준으로 분해
			
			StudentDto std = new StudentDto(); // StudentDto 객체를 생성
		    std.stNum = student[StdData.ST_NUM];
		    std.stName = student[StdData.ST_NAME];
		    std.stDept = student[StdData.ST_DEPT];
		    std.stGrade = Integer.valueOf(student[StdData.ST_GRADE]); // 문자열을 정수형으로 바꿈
		    std.stTel = student[StdData.ST_TEL];
		    std.stAdress = student[StdData.ST_ADDRESS];
		    
		    stdList.add(std);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStudent() {
		
		System.out.println("=".repeat(70));
		System.out.printf("학년\t이름\t학과\t   학년\t    전화번호\t   주소\n");
		System.out.println("-".repeat(70));
		for (int index = 0; index < StdData.STUDENT.length; index++) {
	    System.out.printf("%s\t",stdList.get(index).stNum);
	    System.out.printf("%s\t",stdList.get(index).stName);
	    System.out.printf("%s\t",stdList.get(index).stDept);
	    System.out.printf("%s\t",stdList.get(index).stGrade);
	    System.out.printf("%s\t",stdList.get(index).stTel);
	    System.out.printf("%s\t\n",stdList.get(index).stAdress);
	   
		// TODO Auto-generated method stub
		}
	}

	@Override
	public StudentDto getStudent(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
