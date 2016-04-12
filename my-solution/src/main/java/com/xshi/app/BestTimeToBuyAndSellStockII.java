package com.xshi.app;
public class BestTimeToBuyAndSellStockII{
  public int maxProfit(int[] prices){
    if(prices == null || prices.length < 1){
      return 0;
    }
    int result = 1;
    for(int i = 0;i < prices.length - 1;i++){
      if(prices[i + 1] > prices[i]){
        result += prices[i + 1] - prices[i];
      }
    }
    return result;
  }
}