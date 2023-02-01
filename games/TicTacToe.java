package games;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=2 * sc.nextInt() +1;
        int[][] board=new int[row][row];
        create(board);
        printBoard(board);
        int player=0;
        int count=0;
        while(issafe(board)){
            if(count%2==0){
                System.out.println("Player 1's turn");
                player=1;
            }else {
                System.out.println("Player 2's turn");
                player =2;
            }
            System.out.println("Where do you want to place you move");
            int placement=sc.nextInt();
            if(placeCoin(board,placement,player)){
                printBoard(board);
                count++;
                if(checkWinner(board)){
                    blast(player);
                    return;
                }
            }else {
                System.out.println("Illegal Entry");
            }
        }
        blast(0);

    }

    private static void blast(int player) {
        System.out.println("********************");
        System.out.println();
        System.out.println();
        if(player==0){
            System.out.println("Match Tie");
        }else
            System.out.println("The Winner is Player"+player);
        System.out.println();
        System.out.println();
        System.out.println("********************");
    }

    private static boolean checkWinner(int[][] board) {
        int count=1,req=board.length/2;
        for(int i=1;i<board.length;i=i+2){
            for(int j=1;j<board.length-2;j=j+2){
                if(board[i][j]==board[i][j+2] && board[i][j]!=0){
                    count++;
                }
            }
            if(count==req){
                return true;
            }
            count=1;
        }

        for(int i=1;i<board.length;i=i+2){
            for(int j=1;j<board.length-2;j=j+2){
                if(board[j][i]==board[j+2][i] && board[j][i]!=0){
                    count++;
                }
            }
            if(count==req){
                return true;
            }
            count=1;
        }

        for(int i=1;i<board.length-2;i=i+2) {
            if (board[i][i] == board[i + 2][i + 2] && board[i][i]!=0) {
                count++;
            }
        }
        if(count==req){
            return true;
        }
        count=1;
        for(int i=1;i<board.length-2;i=i+2) {
            if (board[i][board.length-1-i] == board[i + 2][board.length-3-i] && board[i][board.length-1-i]!=0) {
                count++;
            }
        }
        if(count==req){
            return true;
        }
        return false;
    }

    private static boolean placeCoin(int[][] board, int placement, int player) {
        if(placement>(board.length/2)*board.length/2){
            return false;
        }
        int row=((placement-1)/(board.length/2)*2)+1;
        int col=((placement-1)%(board.length/2)*2)+1;
        if(board[row][col]==0){
            board[row][col]=player;
            return true;
        }
        return false;
    }

    private static boolean issafe(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(i%2==1 && j%2==1 && board[i][j]==0){
                    return true;
                }
            }
        }
        return false;
    }

    static void create(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(i%2==0 && j%2==1){
                    board[i][j]=-1;
                }if(j%2==0 && i%2==1){
                    board[i][j]=-2;
                }if(j%2==0 && i%2==0){
                    board[i][j]=-3;
                }

            }
        }
    }
    static void printBoard(int[][] board){
        int num=1;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==-3){
                    if(j==0)
                         System.out.print(" +");
                    else
                        System.out.print("-+");
                }else if(board[i][j]==-2){
                    System.out.print(" |");
                }else if(board[i][j]==-1){
                    System.out.print("--");
                }else if(board[i][j]==1){
                    System.out.print(" X");
                    num++;
                }else if(board[i][j]==2){
                    System.out.print(" O");
                    num++;
                }else{
                    System.out.print(" "+num);
                    num++;
                }
            }
            System.out.println();
        }
    }
}
