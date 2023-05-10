package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.datas.DataIndex;
import com.callor.classes.datas.DataSource;
import com.callor.classes.models.ScoreDto;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{
	protected List<ScoreDto> stdList;
	public ScoreServiceImplV2() {
		// V1 에서 protected 로 선언 scList 를 사용할수 있도록
		// 초기화 하는 작업, 반드시 필요
		scList = new ArrayList<>();
		
		
	}
	
	
	@Override
	public void loadScore() {
		
		
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
		
		
		
		for (String str : DataSource.SCORE) {
			ScoreDto scDto = str2Dto(str);
//			String[] score = str.split(",");
//			ScoreDto scDto = new ScoreDto(score[DataIndex.SCORE.ST_NUM], Integer.valueOf(score[DataIndex.SCORE.SC_KOR]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_ENG]), Integer.valueOf(score[DataIndex.SCORE.SC_MATH]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_MUSIC]), Integer.valueOf(score[DataIndex.SCORE.SC_ART]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_SOFTWARE]),
//					Integer.valueOf(score[DataIndex.SCORE.SC_DATABASE])
//
//			);
			scList.add(scDto);
			
		}
		
	
		
		
	}
	@Override
	public void printScore() {
		StudentService stService = new StudentServiceImplV2();
		
	}
	
	
	
	
}
