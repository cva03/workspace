package permutation;

public class Count {
    public static void main(String[] args) {
        System.out.println(permutation("","abc"));
    }

    static int permutation(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        int count=0;
        int n=p.length();
        for(int i=0;i<=n;i++){
            String first=p.substring(0,i);
            String second=p.substring(i,n);
            count= count + permutation(first+ ch +second, up.substring(1));
        }
        return count;
    }
}
