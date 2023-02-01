package temp;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
    public static int reverse(int x) {
        long num=x;
        long temp=0;
        boolean negative=false;
        if(num<0){
            negative=true;
            num=-1*num;
        }
        int limit=(int)Math.log10(num);
        for(int i=0;i<=limit;i++){
            temp=(temp*10)+(num%10);
            num=num/10;
        }
        if(negative){
            temp=-temp;
        }
        if(temp>Integer.MAX_VALUE || temp<Integer.MIN_VALUE){
            return 0;
        }
        return (int)temp;

    }
}
