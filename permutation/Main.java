package permutation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        wordchek("applea","pleaps");
    }
    static void wordchek(String up1,String up2){
        if(up1.isEmpty()){
            System.out.print(up2);
            return;
        }
        boolean found=false;
        int foundIndex=-1;
        for(int i=0;i<up1.length();i++){
            if(up1.charAt(0)==up2.charAt(i)){
                foundIndex=i;
                found=true;
                break;
            }
        }
        if(found){
                wordchek(remove(up1,0),remove(up2,foundIndex));
        }else {
            System.out.print(up1.charAt(0));
            wordchek(remove(up1,0),up2);
        }
    }
    static String remove(String up2, int in){
        String forUp2="";
        for(int i=0;i<up2.length();i++){
            if(i!=in) {
                forUp2 += up2.charAt(i);
            }
        }
        return forUp2;
    }
}