package subset;

public class MaximizeElements {
    public static void main(String[] args) {
        int a[]={2,4,6,0,9,99,1000,3};
        int b[]={5,6,6,6,1,2,3,1};
        print(a,b);
    }
    public static void print(int[] arr1, int[] arr2 ){
        int count=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j< arr1.length;j++){
                if(arr1[i]==arr2[j]){
                    arr1[i]=Integer.MIN_VALUE;
                }
                if(arr1[i]==arr1[j] && i!=j){
                    arr1[i]=Integer.MIN_VALUE;
                }
                if(arr2[i]==arr2[j] && i!=j){
                    arr2[i]=Integer.MIN_VALUE;
                }
            }
        }
        while(count<arr1.length){
            int max= Integer.MAX_VALUE;
            int index=-1;
            for(int j=0;j<arr1.length;j++){
                if(max>arr1[j]){
                    max=arr1[j];
                    index=j;
                }
            }
            boolean isPresentInSecond=false;
            for(int k=0;k<arr1.length;k++){
                if(max>arr2[k]){
                    max=arr2[k];
                    index=k;
                    isPresentInSecond=true;
                }
            }
            if(!isPresentInSecond){
                arr1[index]=Integer.MAX_VALUE;
            }
            else {
                arr2[index]=Integer.MAX_VALUE;
            }
            count++;
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]<Integer.MAX_VALUE && arr2[i]>Integer.MIN_VALUE)
                System.out.print(arr2[i]+" ");
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<Integer.MAX_VALUE && arr1[i]>Integer.MIN_VALUE)
                System.out.print(arr1[i]+" ");
        }
    }
}