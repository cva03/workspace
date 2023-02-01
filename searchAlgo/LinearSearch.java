package searchAlgo;

public class LinearSearch {
    public static int find(int[] arr, int num) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static int recurFind(int[] arr, int size,int num){
        return recursion(arr,arr.length,num);
    }

    private static int recursion(int[] arr, int size,int num){
        if(size==0){
            return -1;
        }
        if(arr[size-1]==num){
            return size-1;
        }else{
            return recurFind(arr,size-1,num);
        }
    }
}
