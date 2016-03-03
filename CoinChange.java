public class CoinChange{
  public int coinChange(int[] coins, int amount){
    if(coins == null || coins.length < 1){
      return -1;
    }

    int[] dp = new int[amount + 1];
    int curr = 0;
    while(++curr <= amount){
      int min = -1;
      for(int coin : coins){
        if(curr >= coin && dp[curr - coin] != -1){
          int tmp = dp[curr - coin] + 1;
          min = (min < 0) ? tmp : ((tmp < min) ? tmp : min);
        }
      }
      dp[curr] = min;
    }
    return dp[amount];
  }
}
