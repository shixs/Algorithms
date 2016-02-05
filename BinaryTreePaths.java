import java.util.*;

public class BinaryTreePaths{
  public static List<String> binaryTreePaths(TreeNode root){
    List<String> res = new ArrayList<String>();
    if(root != null){
      helper(root,"",res);
    }
    return res;
  }
  
  private static void helper(TreeNode node, String treePath, List<String> res){
    if(node.left == null && node.right == null){
      res.add(treePath + node.val);
    }
    if(node.left != null){
      helper(node.left,treePath + node.val + "->",res);
    }
    if(node.right != null){
      helper(node.right,treePath + node.val + "->",res);
    }
  }

  public static void main(String[] args){
    TreeNode root = new TreeNode(1);
    TreeNode node1 = new TreeNode(2);
    TreeNode node2 = new TreeNode(3);
    TreeNode node3 = new TreeNode(4);
    TreeNode node4 = new TreeNode(5);
    TreeNode node5 = new TreeNode(6);
    TreeNode node6 = new TreeNode(7);
    TreeNode node7 = new TreeNode(8);
    TreeNode node8 = new TreeNode(9);
    TreeNode node9 = new TreeNode(10);
    root.left = node1;
    root.right = node2;
    node1.left = node3;
    node1.right = node4;
    node2.left = node5;
    node2.right = node6;
    node3.left = node7;
    node4.right = node8;
    node5.right = node9;

    List<String> res = binaryTreePaths(root);
    for(String s : res){
      System.out.println(s);
    }
  }
}
