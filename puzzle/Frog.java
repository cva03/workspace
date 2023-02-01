package puzzle;

public class Frog {
    public static void main(String[] args) {
        System.out.println(countWays(0,4,""));
    }
    static long countWays(int total,int num, String index)
    {
        long count=0;
        if(total==num){
            return 1;
        } else if (total>num) {
            return 0;
        }
        for(int i=1;i<=3;i++){
            count=count+countWays(total+i,num,index+i);
        }
        return count;
    }
}
