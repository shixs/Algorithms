public class Compression{
  public static String compression(String str){
    if(str == null || str.length() < 1){
      return str;
    }

    StringBuffer sBuffer = new StringBuffer();
    char temp = str.charAt(0);
    sBuffer.append(temp);
    int count = 1;
    for(int i = 1;i < str.length();i++){
      if(str.charAt(i) == temp){
        count++;
      }else{
        if(count > 1){
          sBuffer.append(count);
        }
        temp = str.charAt(i);
        sBuffer.append(temp);
        count = 1;
      }
    }
    if(count > 1){
      sBuffer.append(count);
    }
    return sBuffer.length() > str.length() ? str : sBuffer.toString();
  }

  public static void main(String[] args){
    System.out.println(compression("aabewww"));
  }
}
