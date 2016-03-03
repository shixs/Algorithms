import java.util.*;
public class ValidParentheses{
  public static boolean isValid(String s){
    if(s.length() < 0){
      return false;
    }
    Stack<Character> stack = new Stack<>();
    for(int i = 0;i < s.length();i++){
      switch(s.charAt(i)){
        case '(' :
          stack.push('(');
          break;
        case '{' :
          stack.push('{');
          break;
        case '[' :
          stack.push('[');
          break;
        case ')' :
          if(stack.isEmpty() || stack.pop() != '('){
            return false;
          }
          break;
        case '}' :
          if(stack.isEmpty() || stack.pop() != '{'){
            return false;
          }
          break;
        case ']' :
          if(stack.isEmpty() || stack.pop() != '['){
            return false;
          }
          break;
        default:
          return false;
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args){
    String s = "[]()";
    String ss = "[(]}";
    System.out.println(isValid(s));
    System.out.println(isValid(ss));
  }
}
