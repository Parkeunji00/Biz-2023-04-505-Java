package com.callor.classes.exec;

import com.callor.classes.models.StudentDto;
import com.callor.classes.service.impl.StudentService;
import com.callor.classes.service.impl.StudentServiceImplV1;

public class StudentExecA {
	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV1();

		// stService.loadStudent();
		stService.printStudent();
		StudentDto stDto = stService.getStudent("S0001");
		// null safe coding
		// method 호출하여 return 값을 결과로 하여 다른 객체변수에
		// 저장을 하고 객체의 속성, method 들을 통하여 다른 일을
		// 수행하려고 할때 객체 자체가 null 일 경우 오류 발생
		// 이러한 상황을 미리 예측하고, 대비하는 코드
		if (stDto != null) {

			System.out.println(stDto.stNum);
			System.out.println(stDto.toString());

		} else {
			System.out.println("찾는 데이터가 없음");
		}

		try {
			System.out.println(stDto.stNum);
			System.out.println(stDto.toString());

		} catch (Exception e) {
			System.out.println("찾는 데이터가 없음");
			// TODO: handle exception
		}
	}
}
