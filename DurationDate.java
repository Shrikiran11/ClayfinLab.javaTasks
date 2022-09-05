import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
class DurationDate{
    public static void findDuration(LocalDate myDate){
        LocalDate now=LocalDate.now();
   int daysMy=myDate.getDayOfMonth();
   int daysNow=now.getDayOfMonth();
   int days=daysNow-daysMy;
   int monthsMy=myDate.getMonthValue();
   int monthsNow=now.getMonthValue();
   int months=monthsNow-monthsMy;
   int yearsMy=myDate.getYear();
   int yearNow=now.getYear();
   int year=yearNow-yearsMy;
   System.out.println("years: "+year+" Months :"+months+" days :"+days);
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your date");
        String str=scn.next();
         LocalDate myCustomDate=LocalDate.parse(str);
         DurationDate.findDuration(myCustomDate);
    }
}