import java.io.*;
import java.util.*;

public class MoveZeroes{
	public static void moveZeroes(int[] nums){
		if(nums == null || nums.length < 1){
			throw new IllegalArgumentException();
		}

		int p = 0;
		for(int i = 1;i < nums.length;i++){
			if(nums[p] == 0){
				if(nums[i] != 0){
					int tmp = nums[p];
					nums[p] = nums[i];
					nums[i] = tmp;
					p++;
				}
			}else{
				p++;
			}

		}
	}

	public static void main(String[] args){
		int[] nums = {0,0,1,1,0,3,12,0,0};	
		try{
			moveZeroes(nums);
			for(int n:nums){
				System.out.print(n + " ");
			}
		}catch(IllegalArgumentException e){
			System.out.println(e.toString());
		}
	}
}
