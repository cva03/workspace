package subset;

import java.util.ArrayList;
import java.util.List;

public class SubsetWithoutDuplicate {
    public static void main(String[] args) {
        int[] arr= new int[]{1, 2, 2};
        List<List<Integer>> outer=subset(arr);
        for(List a: outer){
            System.out.println(a);
        }
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int j=0;j<arr.length;j++){
            start=0;
            if(j>0 && arr[j]==arr[j-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int i=start;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }
        return outer;

    }
}
