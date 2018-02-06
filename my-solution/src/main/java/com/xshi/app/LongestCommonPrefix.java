public class LongestCommonPrefix{
  public static String longestCommonPrefix(String[] strs){
    if(strs == null || strs.length == 0){
      return "";
    }
    String prefix = strs[0];
    int i = 1;
    while(i < strs.length){
      while(strs[i].indexOf(prefix) != 0){
        prefix = prefix.substring(0,prefix.length() - 1);
      }
      i++;
    }
    return prefix;
  }

  public static void main(String[] args){
    String[] strs = {"abcd","aabc","abe","aba"};
    System.out.println(longestCommonPrefix(strs));
  }
}
