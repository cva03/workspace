package temp;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(132));
    }
    public static String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        String[] roman ={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int []values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int i = 0;
        while(num > 0){
            while(num >= values[i]){
                num -= values[i];
                res.append(roman[i]);
            }
            i++;
        }
        return res.toString();
    }
}
