import java.util.*;
public class BinaryTreeRightSide{
  public List<Integer> rightSideView(TreeNode root){
    List<Integer> res = new ArrayList<Integer>();
    if(root == null){
      return res;
    }
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    int count = 1, numOfNodesOfCurrentLevel = 1;
    boolean lastNode = true;
    while(!queue.isEmpty()){
      TreeNode node = queue.remove();
      if(node.right != null){
        queue.add(node.right);
      }
      if(node.left != null){
        queue.add(node.left);
      }
      if(queue.size() == 0){
        if(lastNode){
          res.add(node.val);
          return res;
        }else{
          return res;
        }
      }
      if(count == numOfNodesOfCurrentLevel){
        res.add(node.val);
      }
      if(--count == 0){
        numOfNodesOfCurrentLevel = queue.size();
        count = queue.size();
        lastNode = false;
        if(numOfNodesOfCurrentLevel == 1){
          lastNode = true;
        }
      }else{
        lastNode = false;
      }
    }
    return res;
  }
}
