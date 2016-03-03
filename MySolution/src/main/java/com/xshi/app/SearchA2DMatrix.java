import java.io.*;
import java.util.*;

public class SearchA2DMatrix{
  public static boolean searchMatrix(int[][] matrix, int target){
    if(matrix == null || matrix.length < 1){
      return false;
    }
    
    int i = 0;
    while(i < matrix.length){
      if(target > matrix[i][matrix[i].length - 1]){
        i++;
      }else{
        int low = 0;
        int high = matrix[i].length - 1;
        while(high >= low){
          int middle = (low + high) / 2;
          if(target == matrix[i][middle]){
            return true;
          }
          if(target > matrix[i][middle]){
            low = middle + 1;
          }
          if(target < matrix[i][middle]){
            high = middle - 1;
          } 
        }
        return false;
      }
    }
    return false;
  }

  public static void main(String[] args){
    int[][] nums = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
    System.out.println(searchMatrix(nums,3));
  }
}
