package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.models.StudentDto;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{
	protected List<StudentDto> stdList;
	public ScoreServiceImplV2() {
		// V1 에서 protected 로 선언 scList 를 사용할수 있도록
		// 초기화 하는 작업, 반드시 필요
		scList = new ArrayList<>();
		
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
		
	}
	@Override
	public void loadScore() {
	
		
		
	}
	
}
