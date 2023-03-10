package subset;

import java.util.ArrayList;

public class SubsetINarraylist {
    public static void main(String[] args) {
        System.out.println(subset("","abc"));
    }
    static ArrayList<String> subset(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list =new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left= subset(p+ch,up.substring(1));
        ArrayList<String> right=subset(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
