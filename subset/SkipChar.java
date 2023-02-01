package subset;

public class SkipChar {
    public static void main(String[] args) {
        skipchar("","baccad");
    }
    public static void skipchar(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skipchar(p,up.substring(1));
        }else{
             skipchar(p+ch,up.substring(1));
        }
    }
}
