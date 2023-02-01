package puzzle;

import java.net.Inet4Address;
import java.util.Scanner;

public class peakelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=peak(arr);
        System.out.println(ans);
    }

    private static int peak(int[] arr) {
        int max= Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        if(index>=0){
            System.out.println("Possible answer: "+ index);
            return 1;
        }
        return 0;
    }
}
