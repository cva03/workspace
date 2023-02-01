package temp;

import java.util.Scanner;

public class Sol {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int[] value={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] symbol={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int input=sc.nextInt();
        String result="";
        while(input>0){
            for(int i=value.length-1;i>=0;i--){
                if(input-value[i]>=0){
                    input=input-value[i];
                    result=result+symbol[i];
                    i++;
                }
            }
        }
        System.out.println(result);
    }


}
