package com.callor.classes.exec;

import com.callor.classes.module.ServiceD;

public class ExecM {
	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 50) + 51;
		int rndNum2 = (int) (Math.random() * 50) + 51;
		ServiceD SvD = new ServiceD();
        SvD.add(rndNum, rndNum2);
	}
}
