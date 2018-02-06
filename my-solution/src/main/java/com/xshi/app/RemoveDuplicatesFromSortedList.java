import java.io.*;
import java.util.*;

public class RemoveDuplicatesFromSortedList{
  public static ListNode removeDuplicates(ListNode head){
    if(head == null){
      return null;
    }
    ListNode p = head;
    while(p.next != null){
      if(p.next.val == p.val){
        p.next = p.next.next;
      }else{
        p = p.next;
      }
    }
    return head;
  }

  public static ListNode removeDuplicatesII(ListNode head){
    if(head == null){
      return null;
    }
    ListNode p = head;
    HashSet<Integer> set = new HashSet<Integer>();
    set.add(p.val);
    while(p.next != null){
      if(set.add(p.next.val)){
        p = p.next;
      }else{
        p.next = p.next.next;
      }
    }
    return head;
  }
  public static void main(String[] args){
    ListNode head = new ListNode(1);
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);

    head.next = node1;
    node1.next = node2;

    ListNode newHead = removeDuplicatesII(head);
    while(newHead != null){
      System.out.println(newHead.val);
      newHead = newHead.next;
    }
  }
}
