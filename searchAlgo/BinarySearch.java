package searchAlgo;

public class BinarySearch {
    public static int find(int[] arr, int num){
        System.out.println("Use only sorted numbers");
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==num){
                return mid;
            }else if(arr[mid]<num){
                start=mid+1;
            }else if(arr[mid]>num){
                end=mid-1;
            }
        }
        return -1;
    }

    public static int recurFind(int [] arr, int num){
        return recursion(arr,num,0,arr.length-1);

    }

    private static int recursion(int[] arr, int num, int start, int end) {
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==num){
            return mid;
        }else if(arr[mid]<num){
            start=mid+1;
        }else if(arr[mid]>num){
            end=mid-1;
        }
        return recursion(arr,num,start,end);
    }
}
