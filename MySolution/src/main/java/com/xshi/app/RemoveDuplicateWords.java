package com.xshi.app;
public class RemoveDuplicateWords{
  public String removeDuplicateWords(String sentence){
    String[] wrods = sentence.split(" ");
    StringBuffer stringBuffer = new StringBuffer();
    HashSet<String> set = new HashSet<>();
    for(String word : words){
      if(set.add(word)){
        stringBuffer.append(word);
      }
    }
    return stringBuffer.toString();
  }
}