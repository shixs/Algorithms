import java.io.*;
import java.util.*;

public class RemoveElement{
	//using one pointer
	public static int removeElement3(int[] nums, int val){
		if(nums == null || nums.length < 1){
			throw new IllegalArgumentException();
		}

		int p = 0;
		for(int i = 0;i < nums.length;i++){
			if(nums[i] != val){
				nums[p] = nums[i];
				p++;
			}
		}
		return p;
	}
	public static int removeElement(int[] nums, int val){
		if(nums == null || nums.length < 1){
			throw new IllegalArgumentException();
		}
		int newLen = 0;
        	int i = 0;
        	int j = nums.length - 1;

        	while(i <= j){
			if(nums[i] == val){
                		if(nums[j] != val){
                    			int n = nums[i];
                    			nums[i] = nums[j];
              				nums[j] = n;
                    			i++;
                    			j--;
                    			newLen++;
                		}else{
                    			j--;
                		}
            		}else{
                		newLen++;
                		i++;
            		}
        	}

        	return newLen;
	}
	
	public static int removeElement2(int[] nums, int val){
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
			System.out.println(removeElement3(nums,1));
		}catch(IllegalArgumentException e){
			System.out.println(e.toString());
		}
	}
}

