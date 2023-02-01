import java.util.concurrent.TimeUnit;

public class Fraction {
    public static void main(String[] args) {


        for (int i = 1; i <= 60; i++) {
            System.out.println(i + " seconds elapsed");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        int a=-2147483648;
//        int b=-1;
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(a);
//        System.out.println((int) a/b);
//       // int a=20,b=10;
//       //
//      fraction(a,b,a);
    }
    static void fraction(int a,int b,int dummy){
        if((a%dummy==0 && b%dummy==0) ){
            System.out.println(a/dummy+"/"+b/dummy);
            return;
        }
        fraction(a,b,dummy-1);
    }
}
