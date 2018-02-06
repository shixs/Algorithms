import java.io.*;
import java.util.*;

public class RemoveDuplicate{
	public static int removeDuplicate(int[] nums){
		if(nums == null || nums.length < 1){
			throw new IllegalArgumentException();
		}

		int p = 0;
		for(int i = 1; i < nums.length; i++){
			if(nums[i] != nums[p]){
				p++;
				nums[p] = nums[i];
			}
		}
		return p + 1;
	}

	public static void main(String[] args){
		int[] nums = {-1,0,0,0,0,3,3,3};
		int[] nums_err = {};
		try{
			//System.out.println(removeDuplicate(nums_err));
			System.out.println(removeDuplicate(nums));
		}catch(IllegalArgumentException e){
			System.out.println(e.toString());
		}
	}
}
