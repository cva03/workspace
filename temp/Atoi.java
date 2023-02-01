package temp;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("123"));
    }
    public static int myAtoi(String s) {
        String ans="";
        boolean started=false;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                if(started) {
                    ans += c;
                } else if(i > 0 && (s.charAt(i-1) == '-' || s.charAt(i-1) == '+')) {
                    ans += s.charAt(i-1);
                    ans += c;
                    started = true;
                } else {
                    ans += c;
                    started = true;
                }
            } else if(started){
                break;
            } else if (c != ' ' && c != '-' && c != '+') {
                return 0;
            } else if (i > 0 && (s.charAt(i-1) == '-' || s.charAt(i-1) == '+')) {
                return 0;
            }
        }
        if(ans.length() == 0){
            return 0;
        }
        try {
            int num = Integer.parseInt(ans);
            return num;
        } catch (NumberFormatException e) {
            if (ans.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }
}
