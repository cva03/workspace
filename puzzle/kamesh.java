package puzzle;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class kamesh {
//    public static void main(String[] args) {
//        int[] arr=new int[]{1,2,6,7};
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        for(int i=1;i<=max;i++){
//            boolean present=false;
//           for(int j=0;j<arr.length;j++){
//               if(arr[j]==i){
//                   present=true;
//               }
//            }
//           if(!present){
//               System.out.print(i+" ");
//           }
//        }
//    }
public static void main(String[] args) {
    int[] arr=new int[]{2,1,3,10};
    Arrays.sort(arr);
    for(int i=1;i<=arr[arr.length-1];i++){
        boolean present=false;
           for(int j=0;j<arr.length;j++){
               if(arr[j]==i){
                   present=true;
               }
            }
           if(!present){
               System.out.print(i+" ");}
    }
  }
}
