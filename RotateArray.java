import java.io.*;
import java.util.*;

public class RotateArray{
	public static void rotate(int[] nums, int k){
		if(nums == null || nums.length < 1){
			throw new IllegalArgumentException();
		}
		int[] newNums = new int[nums.length + k + 1];
		int index = 0;
		
		for(int i = 0;i < nums.length;i++){
			newNums[i] = nums[i];
			if(i <= k){
				newNums[i + nums.length] = nums[i];
			}
		}

		for(int j = k + 1;j < newNums.length;j++){
			System.out.print(newNums[j] + " ");
		}
	}

	public static void rotate2(int[] nums, int k){
		if(nums == null || nums.length < 1){
			throw new IllegalArgumentException();
		}

		int steps = k % nums.length;
		int[] tmp = new int[steps];

		for(int i = 0; i < steps;i++){
			tmp[i] = nums[nums.length - steps + i];
		}

		for(int i = nums.length - steps - 1;i >= 0;i--){
			nums[i + steps] = nums[i];
		}
		for(int i = 0;i < steps;i++){
			nums[i] = tmp[i];	
		}	
		
		for(int m:nums){
			System.out.print(m + " ");
		}
	}	
	

	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,7};
		try{
			rotate2(nums,3);
		}catch(IllegalArgumentException e){
			System.out.println("Illegal Argument Exception!");
		}
	}
}
