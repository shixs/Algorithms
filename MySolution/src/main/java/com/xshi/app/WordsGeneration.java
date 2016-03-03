import java.io.*;
import java.util.*;
import java.math.*;

/*
Given a word, you can replace the characters with the numbers of them. For example,
consider the following word, "binary", we can give "b5","b1nary" or "6". But you are
not allowed to do it continuously. "bi22" is not allowed.

*/

public class WordsGeneration{
  public static void generateAll(String word){
    if(word == null || word.length() < 1){
      throw new IllegalArgumentException();
    }

    String[] prev = {"1",word.substring(0,1)};
    for(int i = 1;i < word.length();i++){
      String[] curr = {"1", word.substring(i,i + 1)};
      prev = generate(prev,curr);
    }

    for(String s : prev){
      System.out.print(s + "\t");
    }
  }

  private static String[] generate(String[] prev,String[] curr){
    String[] res = new String[prev.length * curr.length];
    int index = 0;
    for(int i = 0;i < curr.length;i++){
      for(int j = 0;j < prev.length;j++){
        if(isNumric(curr[i]) && Character.isDigit(prev[j].charAt(prev[j].length() - 1))){
          int num = Integer.parseInt(curr[i]) + (int)prev[j].charAt(prev[j].length() - 1) - 48;
          char[] temp = prev[j].toCharArray();
          temp[temp.length - 1] = (char) (num + '0');
          res[index++] = String.valueOf(temp);
        }else{
          res[index++] = prev[j] + curr[i];
        }
      }
    }
    return res;
  }

  private static boolean isNumric(String str){
    try{
      int num = Integer.parseInt(str);
    }catch(NumberFormatException e){
      return false;
    }
    return true;
  }

  public static void main(String[] args){
    generateAll("software");
  }
}
