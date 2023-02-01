package permutation;

public class Temp {
    public static void main(String[] args) {
           String up="GEEKSFORGEEKS";
        System.out.println(print("",up,0));
    }
    static int print(String p, String up,int max){
        boolean ispal=false;
        if(p.length()*2+1>max) {
            max=2*p.length()+1;
        }
        for(int j=0;j<up.length();j++) {
            for (int i = up.length() - 1; i > j; i--) {
                if (up.charAt(j) == up.charAt(i)) {
                    max=print(p + up.charAt(j), up.substring(j+1, i),max);
                }
            }
        }
        return max;
    }
}
