import java.io.*;
import java.util.*;

public class LCAOfBST{
  public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
    while(root != null){
      if(root.val > p.val && root.val > q.val){
        root = root.left;
      }else if(root.val < p.val && root.val < q.val){
        root = root.right;
      }else{
        return root;
      }
    }
    return null; //if it is a empty tree
  }

  public static void main(String[] args){
    TreeNode root = new TreeNode(6);
    TreeNode node1 = new TreeNode(2);
    TreeNode node2 = new TreeNode(8);
    root.left = node1;
    root.right = node2;
    TreeNode node3 = new TreeNode(0);
    TreeNode node4 = new TreeNode(4);
    node1.left = node3;
    node1.left = node4;
    TreeNode node5 = new TreeNode(7);
    TreeNode node6 = new TreeNode(9);
    node2.left = node5;
    node2.right = node6;
    TreeNode node7 = new TreeNode(3);
    TreeNode node8 = new TreeNode(5);
    node4.left = node7;
    node4.right = node8;

    System.out.println(lowestCommonAncestor(root,node1,node4).val);
  }
}
