import java.io.*;
import java.util.*;
public class InvertBinaryTree{
  public static class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
      val = x;
    }
  }
  //Recursive
  public static TreeNode invertTree(TreeNode root){
    if(root != null){
      invertTree(root.left);
      invertTree(root.right);
      TreeNode tmp = root.left;
      root.left = root.right;
      root.right = tmp;
    }
    return root;
  }

  //Non-recursive
  public static TreeNode invertTreeII(TreeNode root){
    if(root == null){
      return null;
    }

    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);
    while(!stack.empty()){
      TreeNode node = stack.pop();
      if(node.left != null){
        stack.push(node.left);
      }
      if(node.right != null){
        stack.push(node.right);
      }
      TreeNode tmp = node.left;
      node.left = node.right;
      node.right = tmp; 
    }

    return root;
  }

  private static TreeNode generateTree(){
  TreeNode root = new TreeNode(4);
    TreeNode node1 = new TreeNode(2);
    TreeNode node2 = new TreeNode(7);
    TreeNode node3 = new TreeNode(1);
    TreeNode node4 = new TreeNode(3);
    TreeNode node5 = new TreeNode(6);
    TreeNode node6 = new TreeNode(9);

    root.left = node1;
    root.right = node2;
    node1.left = node3;
    node1.right = node4;
    node2.left = node5;
    node2.right = node6;

    return root;
  }
  
  //print the tree's nodes in preorder
  private static void print(TreeNode root){
    if(root == null){
      return;
    }
    System.out.print(root.val + " ");
    print(root.left);
    print(root.right);
  }

  public static void main(String[] args){
    TreeNode root = generateTree();
    TreeNode root2 = generateTree();
    root = invertTree(root);
    root2 = invertTreeII(root2);
    print(root);
    print(root2);
  }
}
