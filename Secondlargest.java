public class Secondlargest {
    public static void main(String[] args) {
        int largest=0;
        int nthLargest=2;
        int arr[][]=new int[][]{
            {-5,1,-1},
            {-2,-1,1}
        };
            findlargest(arr,1,nthLargest);
    }
    static void findlargest(int[][] arr,int check,int index){
        int max=arr[0][0];
        int index1=0,index2=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                    index1=i;
                    index2=j;
                }
            }
        }
        if(check==index){
            System.out.println(index1+","+index2);
            return;
        }
        arr[index1][index2]=0;
        findlargest(arr,check+1,index);
    }

}
