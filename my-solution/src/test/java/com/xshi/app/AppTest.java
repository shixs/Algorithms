package com.xshi.app;
import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private int[] nums = {1,3,4,5,7,8,11,15,21};
    private int[] res = new int[nums.length];
    private int index = 0;
    
    @Test
    public void testApp()
    {
        /*RemoveDuplicateWords rdw = new RemoveDuplicateWords();
        String sentence = "this is a book a this";
        ConvertSortedArrayToBST toBST = new ConvertSortedArrayToBST();
        TreeNode node = toBST.sortedArrayToBST(nums);
        printGeneratedTree(node);
        KthSmallestElement kse = new KthSmallestElement();
        int res = kse.kthSmallest(generateBST(),3);
        Assert.assertArrayEquals(nums,res);
        
        Fraction fraction = new Fraction();
        String res = fraction.fractionToDecimal(1,3);
        String expected = "0.(3)";
        Assert.assertEquals("Good one!",res,expected);
        */
        DivideTwoIntegers dti = new DivideTwoIntegers();
        Assert.assertEquals("Overflow", dti.divide(-2147483648,1), Integer.MIN_VALUE);
        Assert.assertEquals("Pass",dti.divide(-7,2),-3);

    }

    private TreeNode generateBST(){
      TreeNode root = new TreeNode(5);
      TreeNode node1 = new TreeNode(3);
      TreeNode node2 = new TreeNode(1);
      TreeNode node3 = new TreeNode(4);
      root.left = node1;
      node1.left = node2;
      node1.right = node3;
      TreeNode node4 = new TreeNode(9);
      TreeNode node5 = new TreeNode(7);
      TreeNode node6 = new TreeNode(10);
      root.right = node4;
      node4.left = node5;
      node4.right = node6;
      return root;
    }

    private void printGeneratedTree(TreeNode root){
      if(root == null){
        return;
      }
      printGeneratedTree(root.left);
      res[index++] = root.val;
      printGeneratedTree(root.right);
    }
}
