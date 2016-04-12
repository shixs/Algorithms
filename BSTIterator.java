package com.xshi.app;
public class BSTIterator{
  //private List<Integer> nodes;
  private Stack<TreeNode> stack = new Stack<TreeNode>();
  public BSTIterator(TreeNode root){
    push(root); 
  }

  private void push(TreeNode root){
    while(root != null){
      stack.push(root);
      root = root.left;
    }
  }

  /*private void init(TreeNode root){
    nodes = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    if(root != null){
      TreeNode node = root;
      while(node != null){
        stack.push(node);
        node = node.left;
      }
      while(!stack.isEmpty()){
        node = stack.pop();
        nodes.add(node.val);
        if(node.right != null){
          node = node.right;
          while(node != null){
            stack.push(node);
            node = node.left;
          }
        }
      }
    }  
  }*/
  
  /** @return whether we have a next smallest number */
  public boolean hasNext(){
    return !stack.isEmpty();
    //return (nodes != null && nodes.size() > 0);  
  }

  /** @return the next smallest number */
  public int next(){
    TreeNode curr = stack.pop();
    push(curr.right);
    return curr.val;
    
    //return nodes.remove(0);
  }
}
