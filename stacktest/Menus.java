package stacktest;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Menus {
    static HashMap<Integer,String> mainMenu=new HashMap<Integer, String>();
    public void getMainMenu()
    {
        System.out.println("Enter the choice");
        //Menus =new Menus();
        mainMenu.put(1, "Recharge mobile Number");
        mainMenu.put(2, "Recharge DTH");
        mainMenu.put(3, "Exit");
        getMenus(1, 3);
    }
    public void getMobileRechargeMenu()
    {
        System.out.println("Enter the choice");
        //Menus menu=new Menus();
        mainMenu.put(11, "Prepaid Number");
        mainMenu.put(12, "Postpaid Number");
        mainMenu.put(13, "Back to Main Menu");
        getMenus(11, 13);
    }
    public void getPrepaid()
    {
        System.out.println("Enter the choice");
        mainMenu.put(111, "Airtel");
        mainMenu.put(112, "Aircel");
        mainMenu.put(113, "Jio");
        mainMenu.put(114, "Vodafone");
        mainMenu.put(115, "Back");
        mainMenu.put(116, "Back to Main Menu");
        getMenus(111,116);
    }
    public void getPostpaid()
    {
        System.out.println("Enter the choice");
        //Menus menu =new Menus();
        mainMenu.put(121, "Airtel");
        mainMenu.put(122, "Aircel");
        mainMenu.put(123, "Jio");
        mainMenu.put(124, "Vodafone");
        mainMenu.put(125, "Back");
        mainMenu.put(126, "Back to Main Menu");
        getMenus(121,126);
    }
    public void goBackToMainMenu(Stack<Integer> stack)
    {
        //Menus menu =new Menus();

        while(stack.size()!=0)
        {
            stack.pop();
        }
    }
    public int goBack(int choice,Stack<Integer> stack)
    {
        //Menus menu =new Menus();

        int popval=choice/100;
        stack.pop();
        //dflowStack.pop();
        return popval;
//        while(stack.peek()!=popval)
//        {
//            stack.pop();
//        }
//        stack.pop();
//        choice=getStartIndex(popval)/10;
//        return choice;
        //getMenus(start,start+8);

    }
    public void getMenus(int start,int end)
    {
        //Menus menu =new Menus();
        int index=1;
        while(start<=end)
        {
            for(Map.Entry<Integer, String> entry:mainMenu.entrySet())
            {

                if(entry.getKey()==start)
                {
                    System.out.println(index+". "+entry.getValue());
                    index++;

                }
            }
            start++;
        }

    }
    public int getStartIndex(int popval)
    {
        int length = (int) (Math.log10(popval) + 1);
        int start=1;
        while((length-1)!=0)
        {
            start=start*10+1;
            length--;
        }


        return start;
    }
    public void getDTHMenus()
    {
        System.out.println("Choose the DTH Provider");
        mainMenu.put(21, "SUN Direct");
        mainMenu.put(22, "TATA SKY");
        mainMenu.put(23, "AIRTEL DTH");
        mainMenu.put(24, "Big TV");
        mainMenu.put(25, "AIRTEL DTH");
        mainMenu.put(26, "Back to Main Menu");
        getMenus(21, 26);
    }
}