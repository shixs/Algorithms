import java.io.*;
import java.util.*;

public class MergeSortedArray{
	public static void merge(int[] nums1,int m, int[] nums2,int n){
		if(nums1 == null || nums2 == null){
			throw new IllegalArgumentException();
		}

		int i = m - 1, j = n - 1, k = m + n - 1;
		while(i > -1 && j > -1){
			nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
		}

		while(j > -1){
			nums1[k--] = nums2[j--];
		}
	}

	public static void main(String[] args){
		int[] nums1 = {1,3,4,5,6,9,11,25,43,88,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] nums2 = {-9,-1,3,36,37,66};
		try{
			merge(nums1,10,nums2,6);
			for(int i = 0;i < 16;i++){
				System.out.print(nums1[i] + " ");
			}
		}catch(IllegalArgumentException e){
			System.out.println(e.toString());
		}
	}
}
