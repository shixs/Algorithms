import com.xshi.app.RemoveDuplicateWords;
import com.xshi.app.ConvertSortedArrayToBST;
import com.xshi.app.TreeNode;
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
        //RemoveDuplicateWords rdw = new RemoveDuplicateWords();
        //String sentence = "this is a book a this";
        ConvertSortedArrayToBST toBST = new ConvertSortedArrayToBST();
        TreeNode node = toBST.sortedArrayToBST(nums);
        printGeneratedTree(node);
        Assert.assertArrayEquals(nums,res);
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
