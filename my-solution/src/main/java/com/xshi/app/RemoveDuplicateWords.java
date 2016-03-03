public class RemoveDuplicateWords{
  public String removeDuplicateWords(String sentence){
    StringBuffer stringBuffer = new StringBuffer();
    HashSet<String> set = new HashSet<>();
    String[] words = sentence.split(" ");
    for(String word : words){
      if(set.add(word)){
        stringBuffer.append(word);
      }
    }
    return stringBuffer.toString();
  }
}