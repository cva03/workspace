package permutation;

import java.util.ArrayList;

public class PhonepadList {
    public static void main(String[] args) {
        System.out.println(pad("", "1672"));
    }
    static ArrayList<String> pad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        int digits=up.charAt(0)-'0';
        ArrayList<String> ans= new ArrayList<>();
        for(int i= (digits-1)*3; i< digits * 3; i++){
            char ch= (char)(i + 'a');
            ans.addAll(pad(p+ch,up.substring(1)));

        }
        return ans;
    }
}
