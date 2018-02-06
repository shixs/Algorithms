import java.io.*;
import java.util.*;

public class SetMatrixZeroes{
  public static void setZeroes(int[][] matrix){
    if(matrix == null){
            return;
    }
    boolean firstCol = false;
    boolean firstRow = false;
    for(int i = 0;i < matrix.length;i++){
      if(matrix[i][0] == 0){
        firstCol = true;
          break;
      }
    }

    for(int j = 0;j < matrix[0].length;j++){
      if(matrix[0][j] == 0){
        firstRow = true;
        break;
      }
    }
        
    for(int i = 1;i < matrix.length;i++){
      for(int j = 1;j < matrix[i].length;j++){
        if(matrix[i][j] == 0){
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }
        
    for(int i = 1;i < matrix.length;i++){
      for(int j = 1;j < matrix[i].length;j++){
        if(matrix[i][0] == 0 || matrix[0][j] == 0){
          matrix[i][j] = 0;
        }
      }
    }
        
    if(firstCol){
      for(int i = 0;i < matrix.length;i++){
        matrix[i][0] = 0;
      }
    }
        
    if(firstRow){
      for(int j = 0;j < matrix[0].length;j++){
        matrix[0][j] = 0;
      }
    }    
  }

  public static void main(String[] args){
    int[][] matrix = {{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
    setZeroes(matrix);
    for(int[] i : matrix){
      for(int j : i){
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }
}
