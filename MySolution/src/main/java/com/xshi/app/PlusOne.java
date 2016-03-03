import java.io.*;
import java.util.*;

public class PlusOne{
	public static int[] plusOne(int[] digits){
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

	public static void main(String[] args){
		int[] digits = {9};
		int[] res = plusOne(digits);
		for(int n : res){
			System.out.print(n + " ");
		}
	}
}
