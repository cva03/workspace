package temp;

public class LongestSubstring {
    public static void main(String[] args) {
        String s="pwwkew";
        String longest="";
        int i=1;
        if(s.length()<=1){
            System.out.println(s.length());
        }
        String temp=String.valueOf(s.charAt(0));
        while(i < s.length()){
            if(temp.contains(String.valueOf(s.charAt(i)))){
                if(temp.length()>longest.length()){
                    longest=temp;
                }
                temp=temp.substring(temp.indexOf(s.charAt(i)) + 1) + s.charAt(i);
            }else{
                temp=temp+s.charAt(i);
                if(i==s.length()-1){
                    if(temp.length()>longest.length()){
                        longest=temp;
                    }
                }
            }
            i++;
        }
        System.out.println(longest.length());
    }
}
