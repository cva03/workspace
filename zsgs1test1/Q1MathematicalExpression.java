package zsgs1test1;

import java.util.Scanner;
import java.util.Stack;

public class Q1MathematicalExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==')'){
                if(stack.peek()!='('){
                    System.out.println("invalid");
                    return;
                }
                stack.pop();
            }else if(input.charAt(i)=='+' || input.charAt(i)=='-' || input.charAt(i)=='*' || input.charAt(i)=='/'){
                if((stack.isEmpty() || !checkVariable(stack.peek())) && checkVariable(input.charAt(i-1)) && checkVariable(input.charAt(i+1))) {
                    i++;
                }else if( !checkVariable(stack.peek()) || !checkVariable(input.charAt(i+1))){
                    System.out.println("invalid");
                    return;
                }else{
                    stack.pop();
                    i++;
                }
            }else{
                stack.push(input.charAt(i));
            }
        }
        if(stack.isEmpty()){
            System.out.println("valid");
            return;
        }
            System.out.println("invalid");
    }
    private static boolean checkVariable(char c) {
        if(c>='a' &&c<='z'){
            return true;
        }
        return false;
    }
}
