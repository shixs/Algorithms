public class SurroundedRegions{
  public void solve(char[][] board){
    if(board == null || board.length < 3 || board[0].length < 3){
      return;
    }
    for(int i = 0;i < board.length;i++){
      if(board[i][0] == 'O'){
        helper(board, i, 0);  
      }
      if(board[i][board[0].length - 1] == 'O'){
        helper(board, i, board[0].length - 1);
      }
    }
    for(int j = 0;j < board[0].length;j++){
      if(board[0][j] == 'O'){
        helper(board, 0, j);
      }
      if(board[board.length - 1][j] == 'O'){
        helper(board, board.length - 1, j);
      }
    }
    for(int i = 0;i < board.length;i++){
      for(int j = 0;j < board[0].length;j++){
        if(board[i][j] == 'O'){
          board[i][j] = 'X';
        }else if(board[i][j] == '*'){
          board[i][j] = 'O';
        }
      }
    }

  }
  public void helper(char[][] board, int i, int j){
    board[i][j] = '*';
    if(i > 1 && board[i - 1][j] == 'O'){
      helper(board, i - 1, j);
    }
    if(i < board.length - 2 && board[i + 1][j] == 'O'){
      helper(board, i + 1, j);
    }
    if(j < board[i].length - 2 && board[i][j + 1] == 'O'){
      helper(board, i, j + 1);
    }
    if(j > 1 && board[i][j - 1] == 'O'){
      helper(board, i, j - 1);
    }
  }
}