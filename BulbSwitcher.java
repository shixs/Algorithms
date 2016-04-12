public class BulbSwitcher{
  public int bulbSwitch(int n){
    boolean[] bulbs = new boolean[n];
    for(int i = 0;i < n;i++){
      for(int j = i;j < n;j++){
        if(j % (i + 1) == 0){
          bulbs[j] = !bulbs[j];
        }
      }
    }
    int count = 0;
    for(boolean isOn : bulbs){
      count += (isOn) ? 1 : 0;
    }
    return count;
  }
}
