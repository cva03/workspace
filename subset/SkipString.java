package subset;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipChar("app","apple","nanaappale"));
    }
    static String skipChar(String v,String s,String up){
        if(up.isEmpty()) {
            return "";
        }
        if(up.startsWith(v) && !up.startsWith(s)){
            return skipChar(v,s,up.substring(3));
        }else {
            return up.charAt(0)+skipChar(v,s,up.substring(1));
        }
    }
}
