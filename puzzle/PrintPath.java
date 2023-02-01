package puzzle;

public class PrintPath {
    public static void main(String[] args) {
        boolean[][] arr={
                {true,true,true,true},
                {true,true,true,true},
                {true,true,true,true},
                {true,true,true,true}
        };
        count(arr, "",0,0);

    }

    static void count(boolean[][] arr, String p,int r, int c){
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(r< arr.length-1){
            count(arr,p+'D',r+1, c);
        }
        if(c< arr[0].length-1){
            count(arr,p+"R",r,c+1);
        }
    }
}
