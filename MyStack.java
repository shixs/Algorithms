import java.io.*;
import java.util.*;

public class MyStack{
  private Queue<Integer> queue = new LinkedList<Integer>();

  public void push(int x){
    queue.offer(x);
  }

  public void pop(){
    Queue<Integer> queue = new LinkedList<Integer>();
    while(!this.queue.isEmpty()){
      int num = this.queue.poll();
      if(this.queue.isEmpty()){
        break;
      }
      queue.offer(num);
    }
    this.queue = queue;
  }

  public int top(){
    Queue<Integer> queue = new LinkedList<Integer>();
    while(!this.queue.isEmpty()){
      int num = this.queue.poll();
      queue.offer(num);
      if(this.queue.isEmpty()){
        this.queue = queue;
        return num;
      }
    }
    this.queue = queue;
    return 0;
  }

  public boolean empty(){
    return this.queue.isEmpty();
  }
}
