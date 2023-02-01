package permutation;

import java.util.ArrayList;

public class ListReturn {
    public static void main(String[] args) {
        ArrayList<String> ans= permutation("","abc");
        System.out.println(ans);
    }

    static ArrayList<String> permutation(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        int n=p.length();
        for(int i=0;i<=n;i++){
            String first = p.substring(0,i);
            String second = p.substring(i,n);
            ans.addAll(permutation(first+ch+second, up.substring(1)));
        }
        return ans;
    }

}
