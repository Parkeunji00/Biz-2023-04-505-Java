package com.callor.classes.exec;

import com.callor.classes.service.impl.StudentServiceImplV1;

public class StudentD {
	public static void main(String[] args) {
		StudentServiceImplV1 sip = new StudentServiceImplV1();
		sip.loadStudent();
		sip.printStudent();
		
		
	}

}
