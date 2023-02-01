package permutation;

import java.util.Scanner;

public class Lineline {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] board=new int[row*2+1][col*2+1];
        createboard(board);
        printBoard(board);
        System.out.println("Board Successfully Created");
        int player=1;
        int score1=0;
        int score2=0;
        while(true) {
            if(player%2==1){
                player=1;
            }else{
                player=2;
            }
            System.out.println("Player "+player+"'s turn");
            System.out.println();
            System.out.println("Enter the start and end point");
            int start=sc.nextInt();
            int end=sc.nextInt();
            if(check(board,start,end)){
                if(checkForBox(board,player)){
                    System.out.println("Box conquered");
                    if(player==1){
                        score1++;
                    }else {
                        score2++;
                    }
                    if(Win(board)){
                        printBoard(board);
                        blast(score1,score2);
                        break;
                    }
                    printBoard(board);
                    continue;
                }else{
                    player++;
                }
            }else {
                System.out.println("Illegal Entry");
                continue;
            }
            printBoard(board);
        }

    }

    private static void blast(int score1,int score2) {
        int player;
        if(score1>score2){
            player=1;
        }else{
            player=2;
        }
        System.out.println();
        System.out.println();
        System.out.println("**********************");
        System.out.println();
        System.out.println();
        System.out.println("Player "+player+" Won");
        System.out.println();
        System.out.println();
        System.out.println("**********************");
    }

    private static boolean Win(int[][] board) {
        for(int i=1;i<board.length;i=i+2) {
            for (int j = 1; j < board[0].length; j = j + 2) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkForBox(int[][] board, int player) {
        int repeatcount=0;
        for(int i=1;i<board.length;i=i+2){
            for(int j=1;j<board[0].length;j=j+2){
                if(board[i][j]==0 && board[i+1][j]!=0 && board[i][j+1]!=0 && board[i-1][j]!=0 && board[i][j-1]!=0){
                    board[i][j]=player*(-1);
                    repeatcount++;
                }
            }
        }
        if(repeatcount>0){
            return true;
        }
        return false;
    }

    public static void createboard(int[][] board){
        int count=1;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(i%2==0 && j%2==0){
                    board[i][j]=count++;
                    continue;
                }
                board[i][j]=0;
            }
        }
    }
    public static void printBoard(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]>=10){
                    System.out.print(board[i][j]+" ");
                }else if(board[i][j]>0){
                    System.out.print(" "+board[i][j]+" ");
                }
                if(board[i][j]==-1){
                    System.out.print(" 1 ");
                }
                if(board[i][j]==-2){
                    System.out.print(" 2 ");
                }
                if(board[i][j]==-3){
                    System.out.print(" - ");
                }
                if(board[i][j]==-4){
                    System.out.print(" | ");
                }
                if(board[i][j]==0){
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
    public static boolean check(int[][] board,int start,int end){
        if(end<start){
            int temp=start;
            start=end;
            end=temp;
        }
        if(start<1 || end>(board.length/2+1)*(board[0].length/2+1)){
            return false;
        }
        if(end-start==1){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length-1;j++){
                    if(board[i][j]==start && board[i][j+1]>=0){
                        board[i][j+1]=-3;
                        return true;
                    }
                }
            }
        }
        if(end-start==board[0].length/2+1){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]==start && board[i+1][j]>=0){
                        board[i+1][j]=-4;
                        return true;
                    }
                }
            }
        }
        return false;
    }



}
