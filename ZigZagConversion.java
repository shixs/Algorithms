public class ZigZagConversion{
  public static String convert(String s, int numRows){
    if(s == null || s.length() == 0 || numRows <= 0){
      return "";
    }
    if(s.length() == 1){
      return s;
    }
    int range = 2 * numRows - 2;
    StringBuilder sBuilder = new StringBuilder();
    for(int i = 0;i < numRows;i++){
      for(int j = i;j < s.length();j += range){
        sBuilder.append(s.charAt(j));
        if(i != 0 && i != numRows - 1){
          int index = j + range - i * 2;
          if(index < s.length()){
            sBuilder.append(s.charAt(index));
          }
        }
      }
    }
    return sBuilder.toString();
  }

  public static void main(String[] args){
    System.out.println(convert("PAYPALISHIRING",3));
  }
}
