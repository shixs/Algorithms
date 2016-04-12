package com.xshi.app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by xshi on 3/8/16.
 */
public class Fraction {
  public String fractionToDecimal(int numerator, int denominator){
    if(numerator == 0){
      return "0";
    }
    StringBuffer res = new StringBuffer();
    res.append(((numerator > 0) ^ (denominator > 0)) ? "-" : "");
    long num = Math.abs((long)numerator);
    long den = Math.abs((long)denominator);
    long remainder = num % den;
    res.append(num / den);
    HashMap<Long, Integer> map = new HashMap<>();
    if(remainder == 0){
      return res.toString();
    }else{
      res.append(".");
      map.put(remainder,res.length());
      while(remainder != 0){
        remainder *= 10;
        res.append(remainder / den);
        remainder %= den;
        if(map.containsKey(remainder)){
          int index = map.get(remainder);
          res.insert(index,"(");
          res.append(")");
          break;
        }else{
          map.put(remainder,res.length());
        }
      }
    }
    return res.toString();
  }
}
