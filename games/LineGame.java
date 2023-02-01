package games;

import java.util.Scanner;


public class LineGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CREATE BOARD");
        System.out.println("Enter the board size");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] board = new int[row * 2 - 1][col * 2 - 1];
        setBoard(board);
        System.out.println("The board is created");
        System.out.println();
        printBoard(board);
        int count = 0;
        int player = 0;
        int score1 = 0;
        int score2 = 0;
        while (!gameFinished(board)) {
            System.out.println("Player 1 : " + score1);
            System.out.println("Player 2 : " + score2);
            if (count % 2 == 0) {
                System.out.println("Player 1's turn");
                player = -3;
            } else {
                System.out.println("Player 2's turn");
                player = -4;
            }
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            if (isSafe(t1, t2, board)) {
                if (checkBox(board, player)) {//player 1 is -3
                    if (player == -3) {
                        score1++;
                    } else {
                        score2++;
                    }
                    printBoard(board);
                    if (gameFinished(board)) {
                        break;
                    }
                    System.out.println("Box conquered use your another chance");
                    continue;
                }
                printBoard(board);
                count++;
            } else {
                System.out.println("invalid input");
            }
        }
        blast(score2, score1);
    }

    private static void blast(int score2, int score1) {
        System.out.println("**************************");
        System.out.println();
        System.out.println();
        if (score1 > score2) {
            System.out.println("PLAYER 1 WON !!!!!");
        } else if (score1 == score2) {
            System.out.println("MATCH TIE");
        } else {
            System.out.println("PLAYER 2 WON !!!!!");
        }
        System.out.println();
        System.out.println();
        System.out.println("**************************");

    }

    private static boolean checkBox(int[][] board, int player) {
        boolean found = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i % 2 == 1 && j % 2 == 1 && board[i][j] == 0) {
                    if (found(board, i, j)) {
                        board[i][j] = player;
                        found = true;
                    }
                }
            }
        }
        return found;
    }

    private static boolean found(int[][] board, int i, int j) {
        if (board[i - 1][j] == 0) {
            return false;
        }
        if (board[i][j - 1] == 0) {
            return false;
        }
        if (board[i + 1][j] == 0) {
            return false;
        }
        if (board[i][j + 1] == 0) {
            return false;
        }
        return true;
    }

    private static boolean gameFinished(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i % 2 == 1 && j % 2 == 1 && board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void setBoard(int[][] board) {
        for (int i = 0, num = 1; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    board[i][j] = num++;
                } else {
                    board[i][j] = 0;
                }
            }
        }
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == -1) {
                    System.out.print(" -");
                } else if (board[i][j] == -2) {
                    System.out.print(" |");
                } else if (board[i][j] <= 0 ) {
                    System.out.print("  ");
                } else if (board[i][j] <= 9) {
                    System.out.printf(" "+ board[i][j]);
                } else {
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }
    }
        public static boolean isSafe ( int t1, int t2, int[][] board){
            if (t2 < t1) {
                int temp = t1;
                t1 = t2;
                t2 = temp;
            }
            if (t2 - t1 == 1) {
                int row = (t1 / (board[0].length / 2 + 1)) * 2;
                for (int i = 0; i < board[0].length - 1; i++) {
                    if (board[row][i] == t1 && board[row][i + 1] == 0) {
                        board[row][i + 1] = -1;
                        return true;
                    }
                }
            }
            if (t2 - t1 == board[0].length / 2 + 1) {
                int col = (t1 % (board[0].length / 2 + 1) * 2) - 2;
                if (t1 % (board[0].length / 2 + 1) == 0) {
                    col = board[0].length - 1;
                }
                for (int i = 0; i < board.length - 1; i++) {
                    if (board[i][col] == t1 && board[i + 1][col] == 0) {
                        board[i + 1][col] = -2;
                        return true;
                    }
                }

            }
            return false;
        }
    }

