package com.xshi.app;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class App {
  public static void main( String[] args ){
        /*Result result = JUnitCore.runClasses(DivideTwoIntegers.class);
        for(Failure failure : result.getFailures()){
          System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());*/
    int[] prices = {6,11,12,8,7,15};
    BestTimeToBuyAndSellStockII best = new BestTimeToBuyAndSellStockII();
    System.out.println(best.maxProfit(prices));      
  }
}
