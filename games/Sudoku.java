package games;

public class Sudoku {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
      if(solve(board))
          display(board);
    }

    private static void display(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++)
                System.out.print(board[i][j]+"  ");
            System.out.println();
        }
    }

    static boolean solve(int[][] board){
        int row=-1;
        int col=-1;
        int n= board.length;
        boolean noEmpty=true;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    noEmpty = false;
                    row = i;
                    col = j;
                    break;
                }
            }
            if (!noEmpty)
                break;
        }
        if(noEmpty)
            return true;

        for(int num=1;num<=9;num++)
            if(isSafe(num,board,row,col)){
                board[row][col]=num;
                if(solve(board))
                    return true;
                else
                    board[row][col]=0;
        }
      return false;
    }
    private static boolean isSafe(int num, int[][] board, int row, int col) {
        for(int i=0;i<board.length;i++){
            if(num==board[i][col])
                return false;
            if(num==board[row][i])
                return false;
        }
        int rowlimit= (int) ((row/3)*Math.sqrt(board.length));
        int collimit=(int) ((col/3)*Math.sqrt(board.length));
        for(int i=rowlimit;i<rowlimit+3;i++)
            for(int j=collimit;j<collimit+3;j++){
                if(board[i][j]==num)
                    return false;
            }
        return true;
    }
}
