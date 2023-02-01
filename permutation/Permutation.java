package permutation;

public class Permutation {
    public static void main(String[] args) {
        permutation("","abc");
    }

    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        int n=p.length();
        for(int i=0;i<=n;i++){
            String first=p.substring(0,i);
            String second=p.substring(i,n);
            permutation(first + ch + second, up.substring(1));
        }
    }

}
