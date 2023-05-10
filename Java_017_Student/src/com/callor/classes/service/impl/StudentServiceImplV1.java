package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.config.Line;
import com.callor.classes.datas.DataIndex;
import com.callor.classes.datas.DataSource;
import com.callor.classes.models.StudentDto;

public class StudentServiceImplV1 implements StudentService{

	private List<StudentDto> stdList; // = new ArrayList<>();
	
	// stdList 객체는 Service 생성자 에서 초기화 한다
	public StudentServiceImplV1() {
		// 객체를 초기화
		stdList = new ArrayList<>();
	}
	
	@Override
	public void loadStudent() {
		// STUDENTN 문자열 배열 데이터를 확장for 를 
		// 분해하여 개별 문자열을 str 담고 for() {} 전달하기
		for (String str : DataSource.STUDENT) {
			// str 문자열 변수에 저장된 문자열을 , 기준으로 다시 분해
			// student 배열에 저장하기
			String[] student = str.split(","); // StdData.STUDENT 의 문자열을 컴마를 기준으로 분해
			// StudentDto class type 의 stDto 객체를 생성하고
			// studentDto type 의 객체를 생성하고
			StudentDto std = new StudentDto(); // StudentDto 객체를 생성
			// student 배열의 각 요소를 StudentDto type 의 객체요소(변수) 에 
			//저장하기
		    std.stNum = student[DataIndex.STUDENT.ST_NUM];
		    std.stName = student[DataIndex.STUDENT.ST_NAME];
		    std.stDept = student[DataIndex.STUDENT.ST_DEPT];
		    std.stGrade = Integer.valueOf(student[DataIndex.STUDENT.ST_GRADE]); // 문자열을 정수형으로 바꿈
		    std.stTel = student[DataIndex.STUDENT.ST_TEL];
		    std.stAdress = student[DataIndex.STUDENT.ST_ADDRESS];
		    
		    // 리스트에 추가하기
		    stdList.add(std);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStudent() {
		
		System.out.println(Line.dLINE(100));
		System.out.printf("학년\t이름\t학과\t   학년\t    전화번호\t   주소\n");
		System.out.println(Line.sLINE(100));
		for (StudentDto dto : stdList) {
	    System.out.printf("%s\t",dto.stNum);
	    System.out.printf("%s\t",dto.stName);
	    System.out.printf("%s\t",dto.stDept);
	    System.out.printf("%s\t",dto.stGrade);
	    System.out.printf("%s\t",dto.stTel);
	    System.out.printf("%s\t\n",dto.stAdress);
	   
		// TODO Auto-generated method stub
		}
		System.out.println(Line.dLINE(100));
	}
	/*
	 * stdList 에서 stNum 학번의 학생데이터를 찾아서
	 * 학생데이터를 return 
	 */
	@Override
	public StudentDto getStudent(String stNum) {
		for(StudentDto dto : stdList) {
			if(dto.stNum.equals(stNum)) {
				return dto;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
