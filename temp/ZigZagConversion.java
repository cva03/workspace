package temp;

public class ZigZagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }
    public static String convert(String string, int row) {

        String[] str=new String[row];
        for(int i=0;i<str.length;i++){
            str[i]="";
        }
        int index=0;
        while(true){
            for(int i=0;i< str.length;i++){
                str[i]+=string.charAt(index++);
                if(index==string.length()){
                    return print(str);
                }
            }
            for(int i=row-1;i>=0;i--){
                for(int j=1;j<=row-2;j++){
                    if(i+j==row-1){
                        str[i]+=string.charAt(index++);
                    }else{
                        str[i]+=" ";
                    }
                    if(index==string.length()){
                        return print(str);

                    }
                }
            }
        }

    }
    public static String print(String[] str){
        String string="";
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length();j++){
                if(str[i].charAt(j)!=' ')
                    string+=str[i].charAt(j);
            }
        }
        return string;
    }
}
