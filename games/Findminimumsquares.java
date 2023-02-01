package games;

public class Findminimumsquares {
    public static void main(String[] args) {
        System.out.println(findsquares(6,0,1000));
    }
    static int findsquares(int num, int times,int min){
        if(num<=0){
            if(min>times){
                min=times;
            }
            return min;
        }
        int limit=(int)Math.sqrt(num);
        for(int i=limit;i>=1;i--){
            int num1=num;
            min=findsquares(num-(i*i),times+1,min);
            num=num1;
        }

        return min;
    }
}
