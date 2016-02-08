public class CountAndSay{
  public static String countAndSay(int n){
    if(n == 1){
      return "1";
    }
    String res = "1";
    for(int i = 2; i <= n;i++){
      res = getStr(res);
    }
    return res;
  }

  private static String getStr(String str){
    int count = 1, i = 1;
    StringBuffer sBuffer = new StringBuffer();
    while(i < str.length()){
      if(str.charAt(i) == str.charAt(i - 1)){
        count++;
      }else{
        sBuffer.append(count).append(str.charAt(i - 1));
        count = 1;
      }
      i++;
    }
    if(count != 0){
      sBuffer.append(count).append(str.charAt(i - 1));
    }
    return sBuffer.toString();
  }

  public static void main(String[] args){
    System.out.println(countAndSay(4));
  }
}
