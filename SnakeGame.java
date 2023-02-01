import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SnakeGame {
    private static final int ROWS = 20;
    private static final int COLS = 20;
    private static final int INITIAL_SNAKE_LENGTH = 5;
    private static final int FOOD_POINTS = 10;

    private static int[][] board;
    private static LinkedList<Coordinate> snake;
    private static int score;
    private static boolean gameOver;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        initGame();
        while (!gameOver) {
            printBoard();
            update();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Game Over! Score: " + score);
    }

    private static void initGame() {
        board = new int[ROWS][COLS];
        snake = new LinkedList<>();
        for (int i = 0; i < INITIAL_SNAKE_LENGTH; i++) {
            snake.add(new Coordinate(10, 10 + i));
            board[10][10 + i] = 1;
        }
        score = 0;
        gameOver = false;
        addFood();
    }

    private static void update() {
        System.out.print("Enter direction (w, a, s, d): ");
        String input = scanner.nextLine();
        Coordinate head = snake.getFirst();
        int x = head.getX();
        int y = head.getY();
        if (input.equals("w")) {
            x--;
        } else if (input.equals("a")) {
            y--;
        } else if (input.equals("s")) {
            x++;
        } else if (input.equals("d")) {
            y++;
        } else {
            System.out.println("Invalid input");
            return;
        }
        if (x < 0 || x >= ROWS || y < 0 || y >= COLS) {
            gameOver = true;
            return;
        }
        if (board[x][y] == 1) {
            gameOver = true;
            return;
        }
        if (board[x][y] == 2) {
            score += FOOD_POINTS;
            addFood();
        } else {
            Coordinate tail = snake.removeLast();
            board[tail.getX()][tail.getY()] = 0;
        }
        snake.addFirst(new Coordinate(x, y));
        board[x][y] = 1;
    }

    private static void addFood() {
        int x = (int) (Math.random() * ROWS);
        int y = (int) (Math.random() * COLS);
        while (board[x][y] != 0) {
            x = (int) (Math.random() * ROWS);
            y = (int) (Math.random() * COLS);
        }
        board[x][y] = 2;
    }

    private static void printBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j] == 1) {
                    System.out.print("S ");
                } else if (board[i][j] == 2) {
                    System.out.print("F ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println("Score: " + score);
    }

    private static class Coordinate {
        private int x;
        private int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}




 class InputWithoutEnter {
        public static void main(String[] args) throws IOException {
            System.out.print("Enter your name: ");
            StringBuilder name = new StringBuilder();

            long startTime = System.currentTimeMillis();
            while (System.in.available() > 0) {
                int ch = System.in.read();
                if (ch != -1) {
                    name.append((char) ch);
                    if (System.currentTimeMillis() - startTime >= 10000) {
                        break;
                    }
                }
            }

            System.out.println("Hello, " + name.toString() + "!");
        }
}


