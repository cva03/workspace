package zsgs1test1;

import java.util.Scanner;

public class Q5CountOfCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String ref=sc.nextLine();
        for(int i=0;i<ref.length();i++){
            int count=0;
            for(int j=0;j<input.length();j++){
                if(ref.toLowerCase().charAt(i)==input.toLowerCase().charAt(j)){
                    count++;
                }
            }
            System.out.println(ref.charAt(i)+":"+count);
        }
    }
}
