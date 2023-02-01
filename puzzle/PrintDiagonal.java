package puzzle;

import java.util.ArrayList;

public class PrintDiagonal {
    public static void main(String[] args) {
        boolean[][] arr={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        System.out.println(count(arr,"",0,0));
    }
    static ArrayList<String> count(boolean[][] arr, String p, int r, int c){
        if(r== arr.length-1 && c==arr[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();
        if(c < arr.length-1){
            ans.addAll(count(arr,p+"R", r, c+1));
        }
        if(r < arr[0].length-1){
            ans.addAll(count(arr,p+"D",r+1,c));
        }
        if(r < arr.length-1 && c < arr[0].length-1){
            ans.addAll(count(arr,p+"T",r+1,c+1));
        }
        return ans;
    }
}
