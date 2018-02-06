public class MyAtoi{
  public static int myAtoi(String str){
    //check if this string is empty or null.
    if(str.length() == 0 || str == null){
      return 0;
    }
    int sign = 1, index = 0, num = 0;
    //remove all leading whitespaces.
    while(str.charAt(index) == ' ' && index < str.length()){
      index++;
    }
    //handle signs.
    if(str.charAt(index) == '+' || str.charAt(index) == '-'){
      sign = (str.charAt(index++) == '+') ? 1 : -1;
    }
    //convert and avoid overflow
    while(index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9'){
      int digit = str.charAt(index++) - '0';
      if((num == Integer.MAX_VALUE / 10 && digit >= 8) || num > Integer.MAX_VALUE / 10){
        return (sign > 0) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      num = num * 10 + digit;
    }
    return num * sign;
  }

  public static void main(String[] args){
    System.out.println(myAtoi("    020"));
    System.out.println(myAtoi("2147483648"));
  }
}
