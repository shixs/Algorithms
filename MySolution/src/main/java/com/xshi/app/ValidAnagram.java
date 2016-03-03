import java.io.*;
import java.util.*;

public class ValidAnagram{
  public static boolean isAnagram(String s, String t){
    if(s.length() != t.length()){
      return false;
    }

    int[] map = new int[26];
    for(int i = 0;i < s.length();i++){
      map[s.charAt(i) - 'a']++;
    }
    for(int i = 0;i < t.length();i++){
      if(--map[t.charAt(i) - 'a'] < 0){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args){
    String s = "anagram";
    String t = "nagaram";
    String s2 = "aacc";
    String t2 = "ccac";

    System.out.println(isAnagram(s,t));
    System.out.println(isAnagram(s2,t2));
  }
}
