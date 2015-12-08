import java.io.*;
import java.util.*;

public class RemoveElement{
	public static int removeElement(int[] nums, int val){
		if(nums == null || nums.length < 1){
			throw new IllegalArgumentException();
		}

		int i = 0;
		int j = 1;
		int newLen = 0;

		while(j < nums.length){
			if(nums[i] == val){
				if(nums[j] != val){
					int n = nums[i];
					nums[i] = nums[j];
					nums[j] = n;
					i++;
					j++;
					newLen++;
				}else{
					j++;
					if(j == nums.length){
						break;
					}
				}
			}else{
				i++;
				j++;
				newLen++;
				if(j == nums.length){
					return (nums[i] == val) ? newLen : newLen + 1;
				}
			}
				
		}
		return newLen;
	}

	public static void main(String[] args){
		int[] nums = {1,3,2,4,1,1,6};
		try{
			System.out.println(removeElement(nums,1));
		}catch(IllegalArgumentException e){
			System.out.println(e.toString());
		}
	}
}

