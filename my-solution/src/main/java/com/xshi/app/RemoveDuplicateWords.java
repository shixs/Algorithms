package com.xshi.app;
import java.util.*;
public class RemoveDuplicateWords{
  public String removeDuplicateWords(String sentence){
    StringBuffer stringBuffer = new StringBuffer();
    HashSet<String> set = new HashSet<>();
    String[] words = sentence.split(" ");
    set.add(words[0]);
    stringBuffer.append(words[0]);
    for(String word : words){
      if(set.add(word)){
        stringBuffer.append(" ").append(word);
      }
    }
    return stringBuffer.toString();
  }
}