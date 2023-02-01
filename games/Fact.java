package games;

import java.util.ArrayList;
import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int k = 9;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<ArrayList> result=new ArrayList<>();
        int[][] arr1 = new int[n][n];
        find(n, k, arr,result, 0, 0);
        for(ArrayList<Integer> a:result){
            System.out.println(a);
        }

    }

    private static void find(int n, int k, ArrayList<Integer> arr,ArrayList<ArrayList> result,int sum, int times) {
        if(times==n){
            if(sum==k) {
                System.out.println(arr);
                result.add(arr);
            }
            return;
        }
        for(int i=9;i>0;i--){
            if(arr.contains(i)){
                return;
            }
            arr.add(i);
            sum=sum+i;
            find(n,k,arr,result,sum,times+1);
            sum=sum-arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
        }
    }
}

