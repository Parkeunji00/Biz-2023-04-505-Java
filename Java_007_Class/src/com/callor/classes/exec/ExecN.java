package com.callor.classes.exec;

import com.callor.classes.module.ServiceE;

public class ExecN {
	public static void main(String[] args) {
		
		int Kor = (int) (Math.random() * 50) + 51;
		int Eng = (int) (Math.random() * 50) + 51;
		int Mat = (int) (Math.random() * 50) + 51;
		
		ServiceE SvE = new ServiceE();
		SvE.score(Kor, Eng, Mat);
		
	}

}
