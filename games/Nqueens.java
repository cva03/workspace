package games;

public class Nqueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] arr=new boolean[n][n];
        nqueens(arr,0);
    }
    static void nqueens(boolean[][] arr, int row){
        if(row==arr.length){
            printboard(arr);
            System.out.println();
            return ;
        }
        for(int col=0;col<arr.length;col++){
            if(isSafe(arr,row,col)) {
                arr[row][col] = true;
                nqueens(arr,row+1);
                arr[row][col]=false;
            }
        }
        return;

    }

    private static boolean isSafe(boolean[][] arr, int row, int col) {
        for(int i=0;i<row;i++){
            if(arr[i][col]){
                return false;
            }
        }
        int temp=Math.min(arr.length-col-1,row);
        for(int i=0;i<=temp;i++){
            if(arr[row-i][col+i]){
                return false;
            }
        }
        temp=Math.min(row,col);
        for(int i=0;i<=temp;i++){
            if(arr[row-i][col-i]){
                return false;
            }
        }
        return true;
    }

    static void printboard(boolean[][] arr){
        for(boolean[] element: arr){
            for (boolean ele:element){
                if(ele){
                    System.out.print("Q ");
                }else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
