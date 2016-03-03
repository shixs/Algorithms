package com.xshi.app;

public class PlusOne{
	public int[] plusOne(int[] digits){
		if(digits == null || digits.length < 1){
			throw new IllegalArgumentException();
		}
		for(int i = digits.length - 1;i >= 0;i--){
			if(digits[i] < 9){
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] newNums = new int[digits.length + 1];
		newNums[0] = 1;
		return newNums; 
	}
}
