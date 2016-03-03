import java.io.*;
import java.util.*;

public class SearchForaRange{
  public static int[] searchRange(int[] nums, int target){
    int[] range = new int[2];
    if(nums == null || nums.length < 1){
      return new int[] {-1,-1};
    }

    int start = -1,end = -1;
    for(int i = 0;i < nums.length;i++){
      if(nums[i] == target){
        start = i;
        break;
      }
    }

    if(start == -1){
      return new int[] {-1,-1};
    }

    for(int i = start;i < nums.length;i++){
      if(nums[i] != target){
        end = i - 1;
        break;
      }
    }

    range[0] = start;
    range[1] = (end >= start) ? end : nums.length - 1;
    return range;
  }

  public static void main(String[] args){
    int[] nums = {1,1};
    for(int n : searchRange(nums,1)){
      System.out.print(n + " ");
    }
  }
}
