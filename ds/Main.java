package ds;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        LinkedList list = new LinkedList();
//        list.add(5);
//        list.add(7);
//        list.add(9);
//        list.add(0);
//        list.delete(1);
//        list.print();
//        DoublyLinkedList list = new DoublyLinkedList();
//        list.add(5);
//        list.add(7);
//        list.add(9);
//        list.add(0);

//        char input=sc.next().charAt(0);
//        while(input<='Z'){
//            System.out.println(input);
//            input++;
//        }
        int input =sc.nextInt();
        for(int row=0;row<input;row++){
            for(int space=0;space<row;space++){
                System.out.print("     ");
            }
            for(int stars=row;stars<input;stars++){
                System.out.printf("%10d",(stars+1));
            }
            System.out.println();
        }
    }
}