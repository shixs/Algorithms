import java.io.*;
import java.util.*;

public class UniquePathsII{
  public static int uniquePathWithObstacles(int[][] obstacleGrid){
    if(obstacleGrid == null){
      throw new IllegalArgumentException();
    }
    int h = obstacleGrid.length;
    int l = obstacleGrid[0].length;
    int[][] map = new int[h][l];
    boolean obstacle = false;
    for(int i = 0;i < h;i++){
      obstacle = (obstacleGrid[i][0] == 1) ? true : false;
      if(obstacle){
        for(int j = i;j < h;j++){
          map[j][0] = 0;
        }
        break;
      }
      map[i][0] = 1;
    }

    for(int i = 0;i < l;i++){
      obstacle = (obstacleGrid[0][i] == 1) ? true : false;
      if(obstacle){
        for(int j = i;j < l;j++){
          map[0][j] = 0;            
        }
        break;
      }
      map[0][i] = 1;
    }
    
    for(int i = 1;i < h;i++){
      for(int j = 1;j < l;j++){
        if(obstacleGrid[i][j] == 1){
          map[i][j] = 0;
        }else{
          map[i][j] = map[i - 1][j] + map[i][j - 1];
        }
      }
    }
    return map[h - 1][l - 1];
  }

  public static void main(String[] args){
    int[][] obstacleGrid = {{0,0,0,0},{0,0,1,0},{0,0,0,0},{1,0,0,0},{0,0,0,0}};
    try{
      System.out.println(uniquePathWithObstacles(obstacleGrid));
    }catch(IllegalArgumentException e){
      System.out.println(e.toString());
    }
  }
}
