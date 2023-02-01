package puzzle;

import java.util.ArrayList;
import java.util.ListIterator;

public class Backtracking4way {
    public static void main(String[] args) {
        boolean[][] arr={
                {true,true,false,false},
                {true,false,true,true},
                {true,false,false,true},
                {true,true,true,true}
        };
        ArrayList<String> ans=path(arr,"",0,0);
        System.out.println(ans);


    }
    static ArrayList<String> path(boolean[][] arr, String p, int r, int c){
        if(r== arr.length-1 && c== arr[0].length-1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(!arr[r][c]){
            return ans;
        }
        arr[r][c]=false;
        if(r<arr.length-1){
            ans.addAll(path(arr,p+"Down ", r+1, c));
        }
        if(c<arr[0].length-1){
            ans.addAll(path(arr,p+"Right ",r,c+1));
        }
        if (r > 0) {
            ans.addAll(path(arr,p+"Up ",r-1,c));
        }
        if(c >0){
            ans.addAll(path(arr,p+"Left ",r,c-1));
        }
        arr[r][c]=true;
         return ans;
    }
}
