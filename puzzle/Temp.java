package puzzle;

import java.util.*;

public class temp {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<String> ans=paths("",5);
        Set<String > finalans=new HashSet<String>();
        for(int i=0;i<ans.size();i++) {
            String s = ans.get(i);
            String[] temp = s.split("");
            Arrays.sort(temp);
            String ans1=Arrays.toString(temp);
            finalans.add(ans1);
        }
        System.out.println(finalans);



    }
    static ArrayList<String> paths(String p, int n){
        if(n==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String > ans=new ArrayList();
        for(int i=1;i<=n;i++){
            ans.addAll(paths(p+i,n-i));
        }

        return ans;
    }

}
