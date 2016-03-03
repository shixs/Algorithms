public class BullsAndCows{
  public static String getHint(String secret, String guess){
    int bull = 0;
    int cow = 0;
    int[] nums = new int[10];
    for(int i = 0;i < secret.length();i++){
      if(secret.charAt(i) == guess.charAt(i)){
        bull++;
      }else{
        if(nums[secret.charAt(i) - '0']++ < 0){
          cow++;
        }
        if(nums[guess.charAt(i) - '0']-- > 0){
          cow++;
        }
      }
      
    }
    return bull + "A" + cow + "B";
  }

  public static void main(String[] args){
    System.out.println(getHint("1123","0111"));
  }
}
