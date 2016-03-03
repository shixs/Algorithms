import java.io.*;
import java.util.*;

public class MinimumSizeSubarraySum{
  public static int minSubArrayLen(int s, int[] nums){
    if(nums == null || nums.length < 1 || s < 0){
      throw new IllegalArgumentException();
    }

    int min = Integer.MAX_VALUE, i = 0, j = 0, sum = 0;
    while(i < nums.length){
      sum += nums[i++];
      while(sum >= s){
        min = Math.min(min, i - j);
        sum -= nums[j++];
      }
    }

    return (min == Integer.MAX_VALUE) ? 0 : min;
  }

  public static void main(String[] args){
    int[] nums = {2,3,1,2,4,3};
    try{
      System.out.println(minSubArrayLen(7,nums));
    }catch(IllegalArgumentException e){
      System.out.println(e.toString());
    }
  }
}
