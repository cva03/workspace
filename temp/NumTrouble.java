package temp;

import java.util.Scanner;

public class NumTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Enter the valid input");
            return;
        }
        int[][] arr = new int[n][n * n];
        arr[0][0] = 1;
        for (int i = 0; i < n - 1; i++) {
            int count = 1;
            int start = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[i][j] == 0) {
                    break;
                }
                if (arr[i][j] == arr[i][j + 1]) {
                    count++;
                } else {
                    arr[i + 1][start++] = count;
                    arr[i + 1][start++] = arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    System.out.printf("%3d", arr[i][j]);
                }
            }
            System.out.println();
        }
    }
}
