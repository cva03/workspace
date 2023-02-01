package permutation;

public class CountSubseq {
    public static void main(String[] args) {
        System.out.println(fun("abca"));
    }
    public static int fun(String s)
    {
        // Write your code here
        int mod = (int)1e9+7;
        long[] arr = new long[3];
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'){
                arr[0] = 2*arr[0]%mod+1;
            }else if(c=='b'){
                arr[1] = 2*arr[1]%mod;
                arr[1] = (arr[1]+arr[0])%mod;
            }else{
                arr[2] = 2*arr[2]%mod;
                arr[2] = (arr[2]+arr[1])%mod;
            }
        }
        return (int)arr[2];
    }
}
