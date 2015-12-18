import java.io.*;
import java.util.*;

public class MajorityElement{
  public static int majorityElement(int[] nums){
    if(nums == null || nums.length < 1){
      throw new IllegalArgumentException();
    }
    int majorityE = nums[0];
    int count = 1;
    for(int i = 0;i < nums.length;i++){
      if(count == 0){
        majorityE = nums[i];
        count++;
      }else if(nums[i] == majorityE){
        count++;
      }else{
        count--;
      }
    }
    return majorityE;
  }
  public static void main(String[] args){
    int[] nums = {1,2,3,2,2,1,1,1,4,3,2,1,1,1,6};
    try{
      System.out.println(majorityElement(nums));
    }catch(IllegalArgumentException e){
      System.out.println(e.toString());
    }
  }
}
