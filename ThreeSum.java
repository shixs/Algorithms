import java.io.*;
import java.util.*;

public class ThreeSum{
  public static List<List<Integer>> threeSum(int[] nums){
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    if(nums == null){
      return res;
    }
    Arrays.sort(nums);
    for(int i = 0;i < nums.length - 2;i++){
      if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
        int prev = i + 1, later = nums.length - 1, sum = 0 - nums[i];
        while(prev < later){
          if(nums[prev] + nums[later] == sum){
            res.add(Arrays.asList(nums[i],nums[prev],nums[later]));
            while(prev < later && nums[prev] == nums[prev + 1]){
              prev++;
            }
            while(prev < later && nums[later] == nums[later - 1]){
              later--;
            }
            prev++;
            later--;
          }else if(nums[prev] + nums[later] < sum){
            prev++;
          }else{
            later--;
          }
        }
      } 
    }
    return res;
  }

  public static void main(String[] args){
    int[] nums = {-1,0,1,2,-1,-4};
    List<List<Integer>> res = threeSum(nums);
    for(List<Integer> ls:res){
      for(int n:ls){
        System.out.print(n + " ");
      }
      System.out.println("");
    }
  }
}
