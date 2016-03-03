public class OddEvenLinkedList{
  public static ListNode oddEvenList(ListNode head){
    if(head != null){
      ListNode odd = head, even = head.next, evenHead = even;
      while(even != null && even.next != null){
        odd.next = odd.next.next;
        even.next = even.next.next;
        odd = odd.next;
        even = even.next;
      }
      odd.next = evenHead;
    }
    return head;
  }

  public static void main(String[] args){
    int i = 1;
    ListNode head = new ListNode(1);
    ListNode p = head;
    while(i < 6){
      ListNode node = new ListNode(++i);
      p.next = (i == 6) ? null : node;
      p = p.next;
    }
    head = oddEvenList(head);
    while(head != null){
      System.out.println(head.val);
      head = head.next;
    }
  }
}
