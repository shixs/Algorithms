package com.xshi.app;
public class BestTimeToBuyAndSellStock{
  public int maxProfit(int[] prices){
    if(prices == null || prices.length < 1){
      return 0;
    }

    int min = prices[0], max = 0;
    for(int i = 0;i < prices.length;i++){
      if(prices[i] > min){
        max = Math.max(max, prices[i] - min);
      }else{
        min = prices[i];
      }
    }
    return max;
  }
}
