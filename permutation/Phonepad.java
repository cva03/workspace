package permutation;

public class Phonepad {
    public static void main(String[] args) {
        pad("","7869345");
    }

    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digits=up.charAt(0)-'0';
        for(int i= (digits-1)*3; i < digits*3;i++){
            char ch=(char) (i +'a');
            pad(p+ ch ,up.substring(1));
        }
    }

}
