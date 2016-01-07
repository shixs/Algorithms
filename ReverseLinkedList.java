import java.io.*;
import java.util.*;

public class ReverseLinkedList{
  public static ListNode reverseList(ListNode head){
    ListNode p = null;
    while(head != null){
      ListNode tmp = head.next;
      head.next = p;
      p = head;
      head = tmp;
    }
    return p;
  }

  public static void main(String[] args){
    ListNode head = new ListNode(1);
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(3);
    ListNode node3 = new ListNode(4);
    head.next = node1;
    node1.next = node2;
    node2.next = node3;

    ListNode p = reverseList(head);
    while(p != null){
      System.out.println(p.val);
      p = p.next;
    }
  }
}
