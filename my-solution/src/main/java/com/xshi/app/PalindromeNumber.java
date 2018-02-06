import java.io.*;
import java.util.*;

public class PalindromeNumber{
  public static boolean isPalindrome(int x){
    String s = Integer.toString(x);
    int i = 0, j = s.length() - 1;
    while(i <= j){
      if(s.charAt(i++) != s.charAt(j--)){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args){
    System.out.println(isPalindrome(272));
    System.out.println(isPalindrome(12345));

  }
}
