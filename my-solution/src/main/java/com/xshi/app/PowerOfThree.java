import java.io.*;
import java.util.*;

public class PowerOfThree{
  public static boolean isPowerOfThree(int n){
    while(n > 1){
      if(n % 3 != 0){
        return false;
      }
      n /= 3;
    }
    return (n <= 0) ? false : true;
  }

  public static boolean isPowerOfThreeII(int n){
    if(n == 1){
      return true;
    }
    return Integer.toString(n,3).matches("10.*");
  }

  public static void main(String[] args){
    System.out.println(isPowerOfThreeII(27));
    System.out.println(isPowerOfThreeII(1));
    System.out.println(isPowerOfThreeII(4));
  }
}
