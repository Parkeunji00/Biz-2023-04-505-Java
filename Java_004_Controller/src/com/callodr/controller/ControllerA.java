package com.callodr.controller;

public class ControllerA {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			int intRnd = (int) (Math.random() * 50) + 51;
			if( intRnd >= 51 && intRnd <= 100) {
				System.out.println(intRnd);
				
			} else {
				System.err.println(intRnd);
			}
			
		}
	}
}
