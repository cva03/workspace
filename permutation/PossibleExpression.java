package permutation;

import java.util.ArrayList;

public class PossibleExpression {
    public static void main(String[] args) {
        int n=1234;
        //possible("",0,4261,1);
        char a='2';
        char b='4';
        System.out.println(String.valueOf(Integer.valueOf(a)-48).charAt(0));
        print("4+2+6*2");

    }
    static void possible(String expression, double p,int up,double target){
        if(up==0){
            if(target==p){
                System.out.println(expression);
            }
            return;
        }
        int digits=(int)Math.log10(up);
            for (int i = 1; i <= Math.pow(10, digits+1); i = i * 10) {
                int first = up / i;
                int second = up - (first * i);
                if(first!=0) {
                    possible(expression.isEmpty() ? first + "" : expression + "+" + first, p + first, second, target);
                    if(expression.isEmpty()){
                        continue;
                    }
                        possible(expression.isEmpty() ? first + "" : expression + "/" + first, p / first, second, target);
                        possible(expression.isEmpty() ? first + "" : expression + "*" + first, p * first, second, target);
                        possible(expression.isEmpty() ? first + "" : expression + "-" + first, p - first, second, target);
                }
            }
    }
    static void print(String a){
        ArrayList<Character> all=new ArrayList<>();
        int sum=0;
        for(int i=0;i<a.length();i++){
            all.add(a.charAt(i));
        }
        while(all.size()>1){
            for(int i=0;i<all.size();i++){
                if(all.get(i)=='*'){
                    all.add(i,String.valueOf((Integer.valueOf(all.get(i-1))-48)*(Integer.valueOf(all.get(i+1))-48)).charAt(0));
                    all.remove(i-1);
                    all.remove(i+1);
                    all.remove(i);
                }
            }
            for(int i=0;i<all.size();i++){
                if(all.get(i)=='+'){
                    all.add(i,String.valueOf((Integer.valueOf(all.get(i-1))-48)+(Integer.valueOf(all.get(i+1))-48)).charAt(0));
                    all.remove(i-1);
                    all.remove(i+1);
                }
            }
            for(int i=0;i<all.size();i++){
                if(all.get(i)=='-'){
                    all.add(i,String.valueOf((Integer.valueOf(all.get(i-1))-48)-(Integer.valueOf(all.get(i+1))-48)).charAt(0));
                    all.remove(i-1);
                    all.remove(i+1);
                }
            }
        }
        System.out.println(all.get(0));
    }
}
