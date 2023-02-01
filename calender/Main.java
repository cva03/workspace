package calender;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year :");
        long start=System.nanoTime();
            Year year = new Year(sc.nextInt());
            year.printAllDates();
            long end=System.nanoTime();
            int i=Integer.MAX_VALUE;
        System.out.println(end-start);


//        int Temp=-1;
//        for (int i = 0; i < year; i++) {
//            Temp = Temp + 1;
//            if ((i) % 4 == 0) {
//                if (i>400 && i % 100 == 0 && i % 400 != 0) {
//                    continue;
//                }
//                Temp = Temp + 1;
//            }
//        }
//        Temp=Temp%7;
//        startDate=Temp;
//        if(startDate>6){
//            startDate=startDate-7;
//        }
    }
}
