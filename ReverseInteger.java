public class ReverseInteger{
  public static int reverse(int x){
    int sign = x > 0 ? 1 : -1;
    x = Math.abs(x);
    int res = 0;
    while(x > 0){
      if(Integer.MAX_VALUE / 10 < res || Integer.MAX_VALUE - x % 10 < res * 10){
        return 0;
      }
      res = res * 10 + x % 10;
      x /= 10;
    }
    return res * sign;
  }

  public static void main(String[] args){
    System.out.println(reverse(-321));
  }
}
