package stacktest;

import java.util.Scanner;
import java.util.Stack;
public class StackImplementation {
    Stack<Integer> stack=new Stack<>();
    Scanner sc=new Scanner(System.in);
     void start(){
        String[] strings={"DTH Recharge","Mobile Recharge","FiberNet Recharge","Set Callertune","Exit"};
        printAndGet(strings);
        level2();
    }
    private void level2() {
        String[] strings;
         switch (stack.peek()){
             case 1: {
                 strings = new String[]{"Tata Sky", "Dish Tv", "Jio tv", "TAC tv","Back","Exit"};
                 printAndGet(strings);
                 d2hSettings(stack.peek());
                 break;
             }
             case 2: {
                 strings = new String[]{"Jio", "Airtel", "Vodafone", "BSNL", "DOCOMO","Back","Exit"};
                 printAndGet(strings);
                 mobileSettings(stack.peek());
                 break;
             }
             case 3:{
                 strings=new String[]{"Jio Fibernet","Airtel","ACT","Cherry net","Realwire","Back","Exit"};
                 printAndGet(strings);
                 fiberNetSettings(stack.peek());
                 break;
             }
             case 4:{
                 strings=new String[]{"Tamil Song","English Song","Hindi Song","Back","Exit"};
                 printAndGet(strings);
                 callerTuneSettings(stack.peek());
                 break;
             }
         }
    }

    private void callerTuneSettings(int peeked) {
        String[] strings = {};
        switch (peeked) {
            case 1:
                strings = new String[]{"Ennadi maayavi nee", "Kannama", "Nallai allai", "Nee kavidhaigala", "Back"};
                printAndGet(strings);
                break;
            case 2:
                strings = new String[]{"Past life", "Closer", "Uptown funk", "Without me", "Sunflower", "Back"};
                printAndGet(strings);
                break;
            case 3:
                strings = new String[]{"Tujh mein rab diktha hai", "Thum hi ho", "Kesariya", "Kaun tujhe", "Back"};
                printAndGet(strings);
                break;
            case 4:
                stack.pop();
                level2();
                return;
            case 5:
                stack.empty();
                start();
                return;
        }
        callerTuneSuccess(stack.peek(),strings);
    }

    private void fiberNetSettings(int peeked) {
        long fiberNO;
        switch (peeked){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Enter the FiberNet number");
                fiberNO= sc.nextLong();
                String[] strings={"RS: 399 | 30 MB/S Unlimited for 28 days.",
                        " RS: 599 | 60 MB/S Unlimited for 28 days + 13 OTT apps.",
                        "RS: 999 | 100 MB/S Unlimited for 28 days + 15 OTT apps.",
                        "Back"
                };
                printAndGet(strings);
                int rupees=0;
                switch (stack.peek()) {
                    case 1:
                        rupees = 399;
                        break;
                    case 2:
                        rupees = 599;
                        break;
                    case 3:
                        rupees = 999;
                        break;
                    case 4:
                        stack.pop();
                        stack.pop();
                        level2();
                        return;
                }
                System.out.printf("Your recharge for rupees: %d for the number %d is successfull",rupees,fiberNO);
                break;
            case 6:
                stack.empty();
                start();
        }
    }

    private void d2hSettings(int peeked) {
        long boxNumber;
        switch (peeked){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Enter the Set-Top box number");
                boxNumber= sc.nextLong();
                String[] strings={" RS: 299 | Mega Pack for HD and SD channels.",
                        "Rs: 160 | Value Sports Lite HD and SD.",
                        "Rs: 100 | Dabangg Sports HD Pack.",
                        "Back"
                };
                printAndGet(strings);
                int rupees=0;
                switch (stack.peek()) {
                    case 1:
                        rupees = 299;
                        break;
                    case 2:
                        rupees = 160;
                        break;
                    case 3:
                        rupees = 100;
                        break;
                    case 4:
                        stack.pop();
                        stack.pop();
                        level2();
                        return;

                }
                System.out.printf("Your recharge for rupees: %d for the number %d is successfull",rupees,boxNumber);
                break;
            case 5:
                stack.empty();
                start();
        }
    }

    private void mobileSettings(int peeked) {
         long mobileNumber;
         switch (peeked){
             case 1:
             case 2:
             case 3:
             case 4:
             case 5:
                 System.out.println("Enter the mobile number");
                 mobileNumber= sc.nextLong();
                 String[] strings={" RS: 199 | 1.5 GB / Day Combo 4G Data Pack\n" +
                         "Data: 1.5 GB/day, Voice: Unlimited Calls, SMS : 100 SMS/day Validity.",
                         "Rs: 16 | 3G Data: 2 GB, extra @Rs.0.03/10KB. (price per day: Rs. 16.0).",
                         "Rs: 10 | Talktime: Rs.7.47. Talktime Validity Unrestricted, No service validity available with this talktime pack.",
                         "Back"
                 };
                 printAndGet(strings);
                 int rupees=0;
                 switch (stack.peek()) {
                     case 1:
                         rupees = 199;
                         break;
                     case 2:
                         rupees = 16;
                         break;
                     case 3:
                         rupees = 10;
                         break;
                     case 4:
                         stack.pop();
                         stack.pop();
                         level2();
                         return;
                 }
                 System.out.printf("Your recharge for rupees: %d for the number %d is successfull",rupees,mobileNumber);
                 break;
             case 6:
                 stack.empty();
                 start();
         }
     }
    private void printAndGet(String[] strings) {
         for(int i=0;i<strings.length;i++){
             System.out.println(i+1+". "+strings[i]);
         }
        stack.add(sc.nextInt());
    }

    private void callerTuneSuccess(Integer peek, String[] strings) {
        if(peek==strings.length){
            stack.pop();
            stack.pop();
            level2();
        }else {
            for (int i = 0; i < strings.length-1; i++) {
                if(peek==i+1){
                    System.out.println(strings[i]+" song has been set as your callertune");
                }
            }
        }
    }

}
