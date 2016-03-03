public class RemoveNthNodeFromEndOfList{
  public static ListNode removeNthFromEnd(ListNode head, int n){
    int count = 0;
    ListNode p = head, q = head;
    while(p != null){
      count++;
      p = p.next;
    }
    if(count - n <= 0){
      return head.next;
    }
    int i = 0;
    while(++i < count - n){
      q = q.next;
    }
    q.next = (n == 1) ? null : q.next.next;
    return head;
  }

  public static void main(String[] args){
    ListNode head = new ListNode(1);
    ListNode node = new ListNode(2);
    ListNode node2 = new ListNode(3);
    head.next = node;
    node.next = node2;
    
    ListNode res = removeNthFromEnd(head,1);
    while(res != null){
      System.out.println(res.val);
      res = res.next;
    }
  }
}
