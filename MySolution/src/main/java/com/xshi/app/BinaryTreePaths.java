package com.xshi.app;
import java.util.*;

public class BinaryTreePaths{
  public List<String> binaryTreePaths(TreeNode root){
    List<String> res = new ArrayList<String>();
    if(root != null){
      helper(root,"",res);
    }
    return res;
  }
  
  private void helper(TreeNode node, String treePath, List<String> res){
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
}
