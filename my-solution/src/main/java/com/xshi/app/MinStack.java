public class MinStack{
  private int min = Integer.MAX_VALUE;
  private List<Integer> list = new ArrayList<>();
  public void push(int x){
    min = (x < min) ? x : min;
    list.add(x);
  }

  public void pop(){
    if(list.get(list.size() - 1) == min){
      int index = 1;
      min = list.get(0);
      while(index < list.size() - 1){
        min = (list.get(index) < min) ? list.get(index) : min;
        index++;
      }
    }
    list.remove(list.size() - 1);
    if(list.size() == 0){
      min = Integer.MAX_VALUE;
    }
  }

  public int top(){
    return list.get(list.size() - 1);
  }

  public int getMin(){
    return min;
  }
}
