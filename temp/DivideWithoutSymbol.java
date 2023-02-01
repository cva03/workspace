package temp;

public class DivideWithoutSymbol {
    public static void main(String[] args) {
        System.out.println(divide(10,5));
    }
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        int quotient = 0;
        long dividendLong = Math.abs((long) dividend);
        long divisorLong = Math.abs((long) divisor);

        while (dividendLong >= divisorLong) {
            int shift = 0;
            while (dividendLong >= (divisorLong << shift)) {
                shift++;
            }
            quotient += 1 << (shift - 1);
            dividendLong -= divisorLong << (shift - 1);
        }

        return sign * quotient;
    }
}
