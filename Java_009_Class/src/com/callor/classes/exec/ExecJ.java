package com.callor.classes.exec;


public class ExecJ {
	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {

				return 0;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int[] nums = new int[50];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		int index;
		for(index = 0; index < nums.length; index++) {
			if(prime(nums[index]) % 3 == 0) {
				break;
			}
				
		}
		
		int lastIndex = -1;
		for(int i = 0 ; i < nums.length ; i++) {
			if(prime(nums[i]) > 0) {
				lastIndex = i;
			}
		}
		System.out.println(" 최초의 3의 배수 위치 :" + index);
		System.out.println(" 최초의 prime 수 : " + (nums[index]));
		if(lastIndex > 0) {
			
			System.out.println("마지막 prime 수 위치" + lastIndex);
			System.out.println("마지막 prime 수 :" + nums[lastIndex]);
		}
		
			
	}
}
