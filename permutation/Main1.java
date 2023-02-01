package permutation;

import java.util.Arrays;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        int a[] = {5,7,2,7,2,9,6,8};
        int k = 3;
        int count = 0;
        while (count < a.length / k + (k%2) ) {
            count++;
            int foundindex=findmin(a, n, k);
            print(foundindex,a,k);
        }
    }
    private static void print(int foundindex, int[] a, int k) {
        int limit=0;
        for (int j = foundindex; j < a.length && limit<k; j++) {
                System.out.print(a[j]+" ");
                a[j]=Integer.MAX_VALUE;
                 limit++;
        }
    }

    private static int findmin(int[] a, int n, int k) {
        int index=0;
        int one = findsum(a, k, 0);
        for (int i = 0; i < a.length - k; i = i + k) {
            int two = findsum(a, k, i + k);
            if(one>two){
                one=two;
                index=i+k;
            }
        }
        return index;
    }


        private static int findsum( int[] a, int k, int i){
            int sum = 0;
            int limit=0;
            if(a[i]==Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            for (int j = i; j < a.length && limit<k; j++) {
                    sum=sum+a[j];
                    limit++;
            }
            return sum;
        }
    }



/*
package permutation;

import java.util.Arrays;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=8;
        int a[]={8,9,7,2,4,1,5,0};
        int k=3;
        findmin(a,n,k);
        for(int i=0;i<a.length-k;i=i+k){
            for(int j=i+k;j<a.length;j=j+k){
                int isum=findsum(a,k,i);
                int jsum=findsum(a,k,j);
                if(isum>jsum) {
                    print(a,j,k);
                    remove(a,j,k);
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }

    private static void remove(int[] a, int j, int k) {
        for(int i=0;i<a.length;i++){
            if(j>=0){
                a[i]=Integer.MAX_VALUE;
            }
        }
    }

    private static void print(int[] a, int j, int k) {
        for(int i=0;i<a.length;i++) {
            if (i >= j){
                System.out.println(a[i]);
            }
        }
    }



    private static int findsum(int[] a, int k, int i) {
        int sum=0;
        for (int start=i;start<i+k && start!=a.length;start++){
            sum=sum+a[start];
            if(start==a.length-1){
                break;
            }
        }
        return sum;
    }

}

 */