package temp;

import java.util.Scanner;

public class Jumbled_guru {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for(int i=n-1;i>=0;i--){
            String num=String.valueOf(i);
            for(int j=0;j<num.length()-1;j++){
                a++;
                if(Math.abs(Integer.valueOf(num.charAt(j))-Integer.valueOf(num.charAt(j+1)))!=1){
                    break;
                }
                if(j==num.length()-2){
                    System.out.println(i+" "+a);
                    return;
                }
            }
        }
    }
}
