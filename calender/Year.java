package calender;

public class Year {
    int year;
    String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    String[] months={"Jan","Feb","March","April","May","June","July","August","Sep","Oct","Nov","Dec"};
    int[] daysInMonth={31,28,31,30,31,30,31,31,30,31,30,31};
    int startDate;     //Tuesday
    public Year(int n) {
        this.year =n;
        if(year%4==0 ){
            daysInMonth[1]=29;
            if(year%100==0 && year%400!=0){
                daysInMonth[1]=28;
            }
                   //for leap year
        }
        this.startDate=year-1;
        startDate=startDate+((startDate)/4)-((startDate/100)-((startDate)/400));
        startDate=startDate%7;
        startDate+=1;
        if(startDate>6){
            this.startDate=startDate-7;
        }

    }

    public void printAllDates() {
        printMonth(months,days,startDate,daysInMonth);
    }

    public void printMonth(String[] months,String[] weeks,int startDate,int[] daysInMonth){
        for(int i=0;i<months.length;i++){
            System.out.printf("%20s\n\n",months[i]);
            for(int j=0;j< weeks.length;j++){
                System.out.printf("%5s",weeks[j].substring(0,3));
            }
            System.out.println();
            int count=0;
            int day=1;
            while(day!=daysInMonth[i]+1){
                if(count>=startDate){
                    System.out.printf("%5d",day++);
                    startDate++;
                }else{
                    System.out.print("     ");
                }
                count++;
                if(startDate==7){
                    System.out.println();
                    startDate=0;
                }
            }
            System.out.println("\n");
        }
    }
}
