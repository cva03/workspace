package puzzle;

import java.util.ArrayList;
import java.util.Arrays;

public class BackTrackingPath {
    public static void main(String[] args) {
        boolean[][] arr={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path=new int[arr.length][arr[0].length];
        allPath(arr,"",0,0,path,1);
    }
    static void allPath(boolean[][] arr,String p,int r, int c, int[][] path,int step){
        if(r==arr.length-1 && c==arr.length-1){
            path[r][c]=step;
            for(int[] paths:path){
                System.out.println(Arrays.toString(paths));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(arr[r][c]==false){
            return;
        }
        arr[r][c]=false;
        path[r][c]=step;
        if(r< arr.length-1){
            allPath(arr,p+'D',r+1,c,path,step+1);
        }
        if(c< arr.length-1){
            allPath(arr,p+'R',r,c+1,path,step+1);
        }
        if(r>0){
            allPath(arr,p+'U',r-1,c,path,step+1);
        }
        if(c>0){
            allPath(arr,p+"L",r,c-1,path,step+1);
        }
        arr[r][c]=true;
        path[r][c]=0;
    }
}
