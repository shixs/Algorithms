package com.xshi.app;

public class DivideTwoIntegers{
  /*
    Divide two integers without using multiplication, division and mod operator.
  */
  public int divide(int dividend, int divisor){
    int sign = ((dividend > 0) ^ (divisor > 0)) ? -1 : 1;
    long l_dividend = Math.abs((long)dividend);
    long l_divisor = Math.abs((long)divisor);
    if(l_dividend == 0 && l_divisor > l_dividend){
      return 0;
    }
    if(l_divisor == 0){
      return Integer.MAX_VALUE;
    }
    long res = 0;
    while(l_dividend >= l_divisor){
      long tmp = l_divisor;
      long multiple = 1;
      while(l_dividend > (tmp << 1)){
        tmp <<= 1;
        multiple <<= 1;
      }
      l_dividend -= tmp;
      res += multiple;
    }
    if(res > Integer.MAX_VALUE){
      return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    }
    return sign == -1 ? (int)-res : (int)res;
  }
}