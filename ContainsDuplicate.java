import java.io.*;
import java.util.*;

public class ContainsDuplicate{
	public static boolean containsDuplicate(int[] nums){
		if(nums == null || nums.length < 1){
			throw new IllegalArgumentException();
		}
		HashSet<Integer> set = new HashSet<>(); 
		set.add(nums[0]);
		for(int i = 1;i < nums.length;i++){
			if(!set.add(nums[i])){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args){
		int[] nums1 = {1,2,3,4,5,6,7};
		int[] nums2 = {1,2,-1,4,2,3};
		int[] nums3 = null;
		try{
			System.out.println(containsDuplicate(nums1));
			System.out.println(containsDuplicate(nums2));
			System.out.println(containsDuplicate(nums3));
		}catch(IllegalArgumentException e){
			System.out.println("Illegal Argument Exception!");
		}
	}
}
