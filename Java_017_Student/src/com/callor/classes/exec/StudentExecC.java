package com.callor.classes.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StudentExecC {
	public static void main(String[] args) {
		
		String studentFile = "src/com/callor/classes/datas/Student.csv";
		String saveFile = "src/com/callor/classes/datas/Student-save.csv";
		
		// 객체를 선언만 할때, null 값을 저장하여 초기화를 하면
		// 객체때문에 발생하는 메모리 관련 문제를 조금 줄일 수 있다
		Scanner fileScan = null;
		
		// InputStream is = new FileInputStream(studentFile)
		/*
		 * InputStream 도구
		 * 컴퓨터의 외부(네트워크, 파일 등)로 부터 데이터를 메모리로 load 하는데
		 * 사용하는 도구들의 부모
		 */
		InputStream is = null;
		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileScan = new Scanner(is); // System.in
		while(fileScan.hasNext()){ // 오픈한 파일에 읽을 데이터가 있니 
			System.out.println(fileScan.nextLine()); // 있으면 오픈해
		}
		
		fileScan.close(); // 없으면 닫아
		
		
	}

}
