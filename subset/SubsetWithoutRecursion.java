package subset;

import java.util.ArrayList;
import java.util.List;

public class SubsetWithoutRecursion {
    public static void main(String[] args) {
        int[] arr= new int[]{1, 2, 3};
        List<List<Integer>> outer=subset(arr);
        for(List a: outer){
            System.out.println(a);
        }
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;

    }

}
