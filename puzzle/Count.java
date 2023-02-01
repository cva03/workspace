package puzzle;

public class Count {
    public static void main(String[] args) {
        boolean[][] arr={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int n= count(arr, 0,0);
        System.out.println(n);

    }
    static int count(boolean[][] arr,int r, int c){
        if(r== arr.length-1 && c==arr[r].length-1){
            return 1;
        }
        int count=0;
        if(r < arr.length-1){
            count= count+ count(arr,r+1,c);
        }
       if( c < arr[0].length-1){
           count= count+ count(arr,r,c+1);
       }
        return count;
    }

}
