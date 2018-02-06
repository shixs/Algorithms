import java.util.*;
public class SingleNumber{
  public static int singleNumber(int[] nums){
    if(nums == null){
      return 0;
    }
    HashSet<Integer> set = new HashSet<>();
    int sum = 0;
    for(int i = 0;i < nums.length;i++){
      if(!set.add(nums[i])){
        sum -= nums[i];
      }else{
        sum += nums[i];
      }
    }
    return sum;
  }

  public static int singleNumberXOR(int[] nums){
    if(nums == null){
      return 0;
    }
    int singleNum = 0;
    for(int i = 0;i < nums.length;i++){
      singleNum ^= nums[i];
    }
    return singleNum;
  }

  public static void main(String[] args){
    int[] nums = {1,1,2,3,4,3,4,6,2};
    System.out.println(singleNumberXOR(nums));
  }
}
