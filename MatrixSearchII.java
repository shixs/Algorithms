public class MatrixSearchII{
  public boolean searchMatrix(int[][] matrix, int target){
    if(matrix == null){
      return false;
    }
    int rowNum = matrix.length, columnNum = matrix[0].length;
    int i = 0, j = columnNum - 1;
    while(i < rowNum && j >= 0){
      if(target == matrix[i][j]){
        return true;
      }else if(target < matrix[i][j]){
        j--;
      }else{
        i++;
      }
    }
    return false;
  }
}
