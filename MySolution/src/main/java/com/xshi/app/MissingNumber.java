import java.util.*;
public class MissingNumber{
  public static int missingNumber(int[] nums){
    if(nums == null || nums.length < 1){
      return 0; 
    }else if(nums.length == 1){
      return (nums[0] > 0) ? nums[0] - 1 : 1;
    }
    boolean[] map = new boolean[nums.length + 1];
    for(int i = 0;i < nums.length;i++){
      map[nums[i]] = true;
    }
    for(int j = 0; j < map.length; j++){
      if(!map[j]){
        return j;
      }
    }
    return nums[nums.length - 1] + 1;
  }

  public static int findMissingNumberBySum(int[] nums){
    if(nums == null || nums.length < 1){
      return 0;
    }
    int sum = (1 + nums.length) * nums.length / 2;
    for(int i = 0;i < nums.length;i++){
      sum -= nums[i];
    }
    return sum;
  }
  
  public static int findMissingNumberByBS(int[] nums){
    if(nums == null || nums.length < 1){
      return 0;
    }
    Arrays.sort(nums);
    int start = 0, end = nums.length;
    while(start < end){
      int middle = (start + end) / 2;
      if(nums[middle] > middle){
        end = middle;
      }else{
        start = middle + 1;
      }
    }
    return start;
  }

  public static void main(String[] args){
    int[] nums = {0,1,3};
    System.out.println(findMissingNumberByBS(nums));
    //System.out.println(findMissingNumberBySum(nums));
    //System.out.println(missingNumber(nums));
  }
}
