package zsgs1test1;

import java.util.Scanner;

public class Q4Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] coins=new int[n];
        int amount=sc.nextInt();
        int balance=amount;
        int[] noOfcoins=new int[n];
        for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        //sorting coins in decesding order
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(coins[j]<coins[j+1]){
                    int temp=coins[j];
                    coins[j]=coins[j+1];
                    coins[j+1]=temp;
                }
            }
        }
        int totalCoins=0;
        for(int i=0;i<n;i++){
            noOfcoins[i]=balance/coins[i];
            totalCoins+=noOfcoins[i];
            balance=balance%coins[i];
        }
        if(balance==0){
            for(int i=0;i<n;i++){
                System.out.println(coins[i]+" = "+noOfcoins[i]);
            }
            System.out.println("\n"+totalCoins);
        }else{
            System.out.println("-1");
        }
    }

}
