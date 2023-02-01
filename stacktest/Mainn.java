package stacktest;

        import java.util.Scanner;
        import java.util.Stack;
public class Mainn {
    public static void main(String[] args) {
        Menus menu=new Menus();
        int choice=0,cchoice,popval;
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();

        System.out.println("Recharge platform");

        while(choice!=3)
        {
            if(choice==0)
            {
                menu.getMainMenu();
                choice=sc.nextInt();
                stack.push(choice);
            }
            switch (choice) {
                case 1:
                    menu.getMobileRechargeMenu();
                    cchoice=sc.nextInt();
                    choice=choice*10+cchoice;
                    stack.push(choice);
                    while(choice>=11&&choice<=13)
                    {
                        switch(choice)
                        {
                            case 11:
                                menu.getPrepaid();
                                cchoice=sc.nextInt();
                                choice=choice*10+cchoice;
                                stack.push(choice);
                                if(choice==115)
                                {
                                    choice=menu.goBack(choice, stack);
                                }
                                else if(choice==116) {
                                    menu.goBackToMainMenu(stack);
                                    choice=0;
                                }
                                else
                                {
                                    System.out.println("Enter the Mobile Number");
                                    sc.nextLong();
                                    System.out.println("Enter the amount");
                                    sc.nextInt();
                                    System.out.println("Recharge Successfull!Thank you for Recharging with us :)");
                                    System.out.println("Redirecting to Main Menu");
                                    menu.goBackToMainMenu(stack);
                                    choice=0;
                                }
                                break;
                            case 12:
                                menu.getPostpaid();
                                cchoice=sc.nextInt();
                                choice=choice*10+cchoice;
                                stack.push(choice);
                                if(choice==125)
                                {
                                    choice=menu.goBack(choice, stack);
                                }
                                else if(choice==126) {
                                    menu.goBackToMainMenu(stack);
                                    choice=0;
                                }
                                else
                                {
                                    System.out.println("Enter the Mobile Number");
                                    sc.nextLong();
                                    System.out.println("Enter the amount");
                                    sc.nextInt();
                                    System.out.println("Recharge Successfull!Thank you for Recharging with us :)");
                                    System.out.println("Redirecting to Main Menu");
                                    menu.goBackToMainMenu(stack);
                                    choice=0;
                                }
                                break;
                            case 13:
                                menu.goBackToMainMenu(stack);
                                choice=0;
                        }
                    }
                    break;
                case 2:
                    menu.getDTHMenus();
                    cchoice=sc.nextInt();
                    choice=choice*10+cchoice;
                    stack.push(choice);
                    if(choice==26)
                    {
                        menu.goBackToMainMenu(stack);
                        choice=0;
                    }
                    else
                    {
                        System.out.println("Enter the customer ID");
                        sc.nextInt();
                        System.out.println("Enter the Recharge Amount");
                        sc.nextInt();
                        System.out.println("Recharge Successfull!Thank you for Recharging with us :)");
                        System.out.println("Redirecting to Main Menu");
                        menu.goBackToMainMenu(stack);
                        choice=0;

                    }
                    break;
                case 3:
                    stack.clear();
                    System.exit(0);
                    break;
            }
        }
    }
}