package games;


public class Nknights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] arr= new boolean[n][n];
        nknights(arr,0,0,4);

    }

    static void nknights(boolean[][] arr, int row , int col, int knight){
        if(knight==0){
            printarr(arr);
            System.out.println();
            return;
        }
        if(row== arr.length-1 && col== arr.length){
            return;
        }
        if(col==arr.length){
            nknights(arr,row+1,0,knight);
            return;
        }
        if(isOK(arr,row,col)) {
            arr[row][col]=true;
            nknights(arr, row, col + 1, knight - 1);
            arr[row][col]=false;
        }
        nknights(arr,row,col+1,knight);
    }

    static boolean isOK(boolean[][] arr, int row, int  col){
        if(isValid(arr,row-1,col+2)){
            if(arr[row-1][col+2]){
                return false;
            }
        }
        if(isValid(arr,row-1,col-2)){
            if(arr[row-1][col-2]){
                return false;
            }
        }
        if(isValid(arr,row-2,col+1)){
            if(arr[row-2][col+1]){
                return false;
            }
        }
        if(isValid(arr,row-2,col-1)){
            if(arr[row-2][col-1]){
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(boolean[][] arr, int row, int col) {
        if(row>=0 && col>=0 && row< arr.length && col< arr[0].length){
            return true;
        }
        return false;
    }

    static void printarr(boolean[][] arr){
        for(boolean[] element: arr){
            for(boolean ele: element){
                if(ele) {
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
