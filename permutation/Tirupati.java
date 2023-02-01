package permutation;

import java.util.Scanner;

public class Tirupati {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=" "+sc.nextLine();
        int count=0;
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)==' '){
                for(int j=i+1;j<=count+i;j++){
                    System.out.print(input.charAt(j));
                }
                System.out.print(" ");
                count=0;
            }else{
                count++;
            }
        }
    }
}
