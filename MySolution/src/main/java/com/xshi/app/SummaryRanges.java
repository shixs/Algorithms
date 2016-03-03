import java.io.*;
import java.util.*;

public class SummaryRanges{
	public static List<String> summaryRanges(int[] nums){
		List<String> list = new ArrayList<>();
		if(nums == null | nums.length < 1){
			throw new IllegalArgumentException();
		}else if(nums.length == 1){
			list.add(String.valueOf(nums[0]));
			return list;
		}

		int p = 0;
		for(int i = 1;i < nums.length;i++){
			if(Math.abs(nums[i] - nums[p]) != i - p){
				String str = (i - 1 - p == 0) ? String.valueOf(nums[p]) : String.valueOf(nums[p]) + "->" + String.valueOf(nums[i - 1]);
				list.add(str);
				p = i;
			}

			if(i == nums.length - 1){
				String last = (i - p == 0) ? String.valueOf(nums[p]) : String.valueOf(nums[p]) + "->" + String.valueOf(nums[i]);
				list.add(last);
			}
		}
		return list;
	}

	public static void main(String[] args){
		int[] nums = {-3,-1,0,1,4,5,7,8,9};
		try{
			for(String s:summaryRanges(nums)){
				System.out.print(s + " ");
			}
		}catch(IllegalArgumentException e){
			System.out.println(e.toString());
		}
	}
}
