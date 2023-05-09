package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StdData;
import com.callor.classes.models.StudentDto;

public class StudentC {
	public static void main(String[] args) {

		List<StudentDto> stdList = new ArrayList();
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
	}

}
