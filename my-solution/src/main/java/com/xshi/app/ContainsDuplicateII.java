import java.io.*;
import java.util.*;

public class ContainsDuplicateII{
  public static boolean ContainsNearbyDuplicate(int[] nums, int k){
    if(nums == null || nums.length < 1){
      throw new IllegalArgumentException();
    }
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i = 0;i < nums.length;i++){
      if(i > k){
        set.remove(nums[i - k -1]);
      }
      if(!set.add(nums[i])){
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args){
    int[] nums = {1,2,3,2,2,4,1,1,2,1,1,1,1,5,1};
    try{
      System.out.println(ContainsNearbyDuplicate(nums,3));
    }catch(IllegalArgumentException e){
      System.out.println(e.toString());
    }
  }
}
