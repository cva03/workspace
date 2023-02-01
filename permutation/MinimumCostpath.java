package permutation;

public class MinimumCostpath {
    public static void main(String[] args) {
        int[][] arr=new int[][]{
                {4,4},{3,7}
        };
        System.out.println(minimumCostPath(arr));

    }
    static int min=Integer.MAX_VALUE;
    public static int minimumCostPath(int[][] grid)
    {
        return path(grid,0,0,"",0);
    }
    public static int path(int[][] arr,int row,int col, String path,int sum){
        if(row==arr.length-1 && col==arr[0].length-1){
            sum=sum+ arr[arr.length-1][arr[0].length-1];
            if(sum<min){
                min=sum;
            }
            return 0;
        }
        if(arr[row][col]>=0){
            int temp=arr[row][col];
            arr[row][col]=-1;
            sum=sum+temp;
            if(row>0){
                path(arr,row-1,col,path+temp+" ",sum);
            }
            if(col>0){
                path(arr,row,col-1,path+temp+" ",sum);
            }
            if(row< arr.length-1){
                path(arr,row+1,col,path+temp+" ",sum);
            }
            if(col< arr[0].length-1){
                path(arr,row,col+1,path+temp+" ",sum);
            }
            arr[row][col]=temp;
        }
        return min;
    }
}
