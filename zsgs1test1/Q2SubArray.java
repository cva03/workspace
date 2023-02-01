package zsgs1test1;

import java.util.Arrays;
import java.util.Scanner;

public class Q2SubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } // 1 2 3 5
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum%2!=0){
            System.out.println("Arrays cant be split");
            return;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        sum=sum/2;
        int tempSum=0;
        int[] arrCopy=arr.clone();
        int arr1Size=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=-1) {
                if (arr[i] + tempSum <=sum) {
                    tempSum += arr[i];
                    arr[i] = -1;
                    arr1Size++;
                }
            }
        }
        int[] arr1=new int[arr1Size];
        int[] arr2=new int[arr.length-arr1Size];
        int index1=0;
        int index2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==-1){
                arr1[index1++]=arrCopy[i];
            }else{
                arr2[index2++]=arrCopy[i];
            }
        }
        int sum0=0;
        for(int i=0;i<arr1.length;i++){
            sum0+=arr1[i];
        }
        if(sum0!=sum){
            System.out.println("Arrays cant be split");
            return;
        }
        sum0=0;
        for(int i=0;i<arr2.length;i++){
            sum0+=arr2[i];
        }
        if(sum0!=sum){
            System.out.println("Arrays cant be split");
            return;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
