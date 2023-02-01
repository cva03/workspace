package temp;

import java.util.Scanner;

public class StackParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int limit = (n * (n + 1)) / 2;
        int index = 1;
        int[][] arr = new int[n][n];
        int line = 0;
        while (index <= limit) {
            for (int down = line; down < n && index <= limit; down++) {
                arr[down][down + line] = index++;
            }
            n--;
            for (int up = n - 1; up >= line && index <= limit; up--) {
                arr[up][arr.length - line - 1] = index++;
            }
            n--;
            for (int rev = arr.length - line - 2; rev >= (line * 2) + 1 && index <= limit; rev--) {
                arr[line][rev] = index++;
            }
            ++line;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0) {
                    System.out.printf("%5d", arr[i][j]);
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }
}
