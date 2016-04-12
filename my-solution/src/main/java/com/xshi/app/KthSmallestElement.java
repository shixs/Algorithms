package com.xshi.app;
import java.util.*;
public class KthSmallestElement{
  public int kthSmallest(TreeNode root, int k){
    if(root == null){
      return 0;
    }
    int count = 0;
    Stack<TreeNode> stack = new Stack<>();
    TreeNode node = root;
    while(node != null){
      stack.push(node);
      node = node.left;
    }
    while(!stack.isEmpty()){
      node = stack.pop();
      if(++count == k){
        return node.val;
      }
      if(node.right != null){
        node = node.right;
        while(node != null){
          stack.push(node);
          node = node.left;
        }
      }
    }
    return 0;
  }

}