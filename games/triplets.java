package games;

public class triplets {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j=j+2){
                int k=(isfound(arr[i]+arr[j],arr));
                if(k>0){
                    System.out.println(arr[i]+","+arr[j]+","+k);
                }
                int l=(isfound(arr[i]+arr[j+1],arr));
                if(l>0){
                    System.out.println(arr[i]+","+arr[j+1]+","+l);
                }
            }
        }
    }

    private static int isfound(int i, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end )/ 2;
            if (arr[mid] == i) {
                return arr[mid];
            } else if (i < arr[mid]) {
                end = mid - 1;
            } else if (i > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
