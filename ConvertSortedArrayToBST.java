public class ConvertSortedArrayToBST{
  public TreeNode sortedArrayToBST(int[] nums){
    if(nums == null || nums.length < 1){
      return null;
    }
    return helper(nums, 0, nums.length - 1);
  }
  public TreeNode helper(int[] nums, int left, int right){
    if(left > right){
      return null;
    }
    int middle = (left + right) / 2;
    TreeNode node = new TreeNode(nums[middle]);
    node.lefr = helper(nums, left, middle - 1);
    node.right = helper(nums, middle + 1, right);
    return node;
  }
}