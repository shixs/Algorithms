import java.util.*;

public class WordPattern{
  public static boolean wordPattern(String pattern, String str){
    String[] words = str.split(" ");
    if(pattern.length() != words.length){
      return false;
    }
    
    Map<Character,String> map = new HashMap<Character,String>();
    for(int i = 0;i < words.length;i++){
      if(map.containsKey(pattern.charAt(i))){
        if(!map.get(pattern.charAt(i)).equals(words[i])){
          return false;
        }
      }else{
        if(map.containsValue(words[i])){
          return false;
        }
        map.put(pattern.charAt(i),words[i]);
      }
    }
    /*
    Map map = new HashMap();
    for(Integer i = 0;i < words.length;i++){
      if(map.put(pattern.charAt(i),i) != map.put(words[i],i)){
        return false;
      }
    }*/
    return true;
  }

  public static void main(String[] args){
    String pattern = "abbc";
    String str = "cat dog dog bird";
    System.out.println(wordPattern(pattern,str));
  }
}
