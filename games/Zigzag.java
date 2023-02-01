package games;

import java.util.Scanner;

public class Zigzag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        int row=sc.nextInt();
        String[] str=new String[row];
        for(int i=0;i<str.length;i++){
            str[i]="";
        }
        int index=0;
        while(true){
                for(int i=0;i< str.length;i++){
                    str[i]+=string.charAt(index++);
                    if(index==string.length()){
                        print(str);
                        return;
                    }
                }
                for(int i=row-1;i>=0;i--){
                    for(int j=1;j<=row-2;j++){
                        if(i+j==row-1){
                            str[i]+=string.charAt(index++);
                        }else{
                        }
                        if(index==string.length()){
                            print(str);
                            return;
                        }
                    }
                }
           }

        }

    private static void print(String[] str) {
        String result="";
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length();j++){
                System.out.print(str[i].charAt(j)+" ");
                }
            System.out.println();
            }
        }
//    int n=sc.nextInt();
//    String zeroes="";
//       for(int i=1;i<=n;i++){
//        if(i%5==0){
//            zeroes+='0';
//        }
//    }
//        System.out.println(zeroes);
//}
    }

