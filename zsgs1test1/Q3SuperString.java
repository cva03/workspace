package zsgs1test1;

import java.util.Scanner;

public class Q3SuperString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        String[] x=new String[n];
//        String[] y=new String[m];
//        for(int i=0;i<n;i++){
//        x[i]=sc.nextLine();
//        }
//        for(int i=0;i<n;i++){
//        y[i]=sc.nextLine();
//        }
        String[] x={"ceo","alco","caaeio","ceai"};
        String[] y={"ec","oc","coe"};
        System.out.println();
        int n=x.length;
        int m=y.length;
        int total=0;
        for(int i=0;i<n;i++) {
            int count=0;
            for (int j = 0; j < m; j++) {
                if (check(x[i], y[j])) {
                    count++;
                }
            }
            if(count==m){
                total++;
            }
        }
        System.out.println(total);
    }
    private static boolean check(String x, String s) {
        char[] x1=x.toCharArray();
        char[] s1=s.toCharArray();
        sort(x1);
        sort(s1);
        //sorting every words
        int count=0;  // abbcceeeeee      aceee
        for(int i=0;i<s1.length;i++){
            for(int j=0;j<x1.length;j++){
                if(s1[i]==x1[j]){
                    count++;
                    x1[j]=' ';
                    break;
                }
            }
        }
        if(count==s1.length){
            return true;
        }
        return false;
    }
    private static void sort(char[] x1) {
        for(int i=0;i<x1.length;i++){
            for(int j=0;j<x1.length-i-1;i++){
                if(x1[j]>x1[j+1]){
                    char temp=x1[j];
                    x1[j]=x1[j+1];
                    x1[j+1]=temp;
                }
            }
        }
    }
}
