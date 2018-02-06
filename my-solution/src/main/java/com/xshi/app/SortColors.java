public class SortColors{
  public static void sortColors(int[] nums){
    if(nums == null || nums.length < 1){
      return;
    }
    int start = 0, end = nums.length - 1;
    for(int i = 0; i <= end; i++){
      if(nums[i] == 0 && i != start){
        int tmp = nums[i];
        nums[i--] = nums[start];
        nums[start++] = tmp;
      }else if(nums[i] == 2 && i != end){
        int tmp = nums[i];
        nums[i--] = nums[end];
        nums[end--] = tmp;
      }
    }
  }

  public static void main(String[] args){
    int[] nums = {0,2,1,1,1,2,0,0,2,2,0,1,2,2};
    sortColors(nums);
    for(int num : nums){
      System.out.print(num + "\t");
    }
  }

}
