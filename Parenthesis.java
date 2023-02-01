import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.println(isValid(input));
    }
    static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='}' || s.charAt(i)==')' || s.charAt(i)==']'){
                if(stack.isEmpty()){
                    return false;
                } else if (s.charAt(i)=='}' && stack.peek()=='{') {
                    stack.pop();
                }else if(s.charAt(i)==']' && stack.peek()=='['){
                    stack.pop();
                }else if(s.charAt(i)==')' && stack.peek()=='('){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.add(s.charAt(i));
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}



//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        //print(3);
//        int n=sc.nextInt();
//        List<String> list=new ArrayList<>();
//        print(n,"",list);
//
//    }
//
//    private static void  print(int n, String s,List<String> list) {;
//        if(s.length()==n*2){
//            if(check(s)){
//                System.out.println(s);
//                list.add(s);
//            }
//            return ;
//        }
//       print(n,s+'(',list);
//        print(n,s+')',list);
//    }
//
//    public static boolean check(String paren){
//        StringBuffer sb=new StringBuffer(paren);
//        boolean cond=false;
//        while(sb.length()!=0) {
//            boolean removed = false;
//            for (int j = 0; j < sb.length() - 1; j++) {
//                if (sb.charAt(j) == '(' && sb.charAt(j + 1) == ')') {
//                    sb.deleteCharAt(j);
//                    sb.deleteCharAt(j);
//                    removed=true;
//                    break;
//                }
//            }
//            if(removed==false){
//                return false;
//            }
//        }
//        return true;
//        }

