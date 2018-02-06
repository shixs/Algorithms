public class CountPrimes{
  public static int countPrimes(int n){
    boolean[] compositeNumber = new boolean[n];
    int count = 0;
    for(int i = 2;i < n;i++){
      if(compositeNumber[i] == false){
        count++;
        for(int j = 2; j * i < n;j++){
          compositeNumber[i * j] = true;
        }
      }
    }
    return count;
  }

  public static void main(String[] args){
    System.out.println(countPrimes(10));
  }
}
