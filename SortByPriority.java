import java.util.*;
/*
* Given a defined priority list and a string. Return a new string which contains characters sorted
* based on priority from priority list. 
* priority list, [p,e,a,l], string, "apple"   should return "ppeal"
*
*/

public class SortByPriority{
  public static String sort(char[] priority, String str){
    if(str == null || str.length() < 2){
      return str;
    }
    //Create a hash map to store the key-value pair. In this case, key is the character in priority list and value is its index.
    Map<Character,Integer> map = new HashMap<>();
    for(int i = 0;i < priority.length;i++){
      map.put(priority[i],i + 1);
    }
    //Convert the given string to a new character array.
    char[] array = str.toCharArray();
    //Store characters are not in the priority list.
    StringBuilder sBuilder = new StringBuilder();
    int[] sort = new int[array.length];
    for(int i = 0;i < array.length;i++){
      if(!map.containsKey(array[i])){
        sBuilder.append(array[i]); 
      }else{
        int indexOfPattern = map.get(array[i]);
        sort[i] = indexOfPattern;
      }
    }
    Arrays.sort(sort);
    char[] sorted = new char[array.length];
    int index = 0;
    for(int i = 0;i < sorted.length;i++){
      if(sort[i] != 0){
        for(Map.Entry entry : map.entrySet()){
          if(entry.getValue().equals(sort[i])){
            sorted[index++] = (char)entry.getKey();
            break;
          }
        }  
      }
    }
    String res = new String(sorted);
    res = res + sBuilder.toString();
    return res;
  }

  public static void main(String[] args){
    char[] priority = {'p','e','a','l'};
    System.out.println(sort(priority,"apple"));
  }
}
