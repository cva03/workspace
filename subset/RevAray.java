package subset;

import java.util.Arrays;
import java.util.Scanner;

public class RevAray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{1,2,3,4,5};
        int k=sc.nextInt();
        rev(arr,k);
        System.out.println(Arrays.toString(arr));

    }
    public static void rev(int[] arr,int k){
        for(int i=0;i<arr.length;i=i+k){
            if(i+k>=arr.length){
                swap(i, arr.length -1,arr);
                break;
            }
            swap(i,i+k-1,arr);
        }
    }
    private static void swap(int i, int i1,int[] arr) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }

}
