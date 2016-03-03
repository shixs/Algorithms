public class ProductExceptSelf{
	public int[] ProductExceptSelf(int[] nums){
    if(nums == null || nums.length <= 1){
      return null;
    }
    int[] res = new int[nums.length];
    res[0] = 1;
    for(int i = 1;i < nums.length;i++){
      res[i] = res[i - 1] * nums[i - 1];
    }
    int rightProduct = 1;
    for(int i = nums.length - 1;i >= 0;i--){
      res[i] *= rightProduct;
      rightProduct *= nums[i];
    }
    return res;
	}
}