import java.util.*;
public class ValidSudoku{
  public static boolean isValidSudoku(char[][] board){
    for(int i = 0;i < 9;i++){
      HashSet<Character> setCol = new HashSet<Character>();
      HashSet<Character> setRow = new HashSet<Character>();
      HashSet<Character> setCube = new HashSet<Character>();
      for(int j = 0;j < 9;j++){
        if(board[i][j] != '.' && !setCol.add(board[i][j])){
          return false;
        }
        if(board[j][i] != '.' && !setRow.add(board[j][i])){
          return false;
        }
        int rowIndex = 3 * (i / 3);
        int colIndex = 3 * (i % 3);
        if(board[rowIndex + j / 3][colIndex + j % 3] != '.' && !setCube.add(board[rowIndex + j / 3][colIndex + j % 3])){
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args){
    char[][] sudoku = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','7','9'},{'.','.','.','.','8','.','.','7','9'}};
    System.out.println(isValidSudoku(sudoku));
  }
}
