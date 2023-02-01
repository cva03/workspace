package permutation;

import java.util.Scanner;

public class Zoho3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,3,2,4,5,5,4,2,8};
        int n=a.length;
        conse(a,n);
    }

    private static void conse(int[] a, int n) {
            boolean check=false;
            int count=1,index=-1;
            for(int i=0;i<n-1;i++){
                if(a[i]==a[i+1]){
                    if(count==1)
                        index=i;
                    count++;
                    check=true;
                    if(i+2<n && a[i+2]!=a[i])
                        break;
                }
            }
            if(!check){
                printarr(a,n);
                return;
            }
            swap(a,index,count,n);
            conse(a,n-count);
    }

    private static void printarr(int[] a, int n) {
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    private static void swap(int[] a, int index, int count,int n) {
        for(int i=index;i<n-count;i++){
            a[i]=a[i+count];
        }
    }
}