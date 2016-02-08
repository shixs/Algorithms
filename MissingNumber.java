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

  public static void main(String[] args){
    int[] nums = {0,1,3};
    System.out.println(missingNumber(nums));
  }
}
