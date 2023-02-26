package javabasic.getDay;
import java.util.*;
public class GetDay {

    public static void main(String[] args) {
        System.out.println(getDayNumberOld(2023,3,4));
    }

    public static String getDayNumberOld(int year, int month, int day ) {
        String dayOfWeek = "";
        Calendar cal = Calendar.getInstance();
        cal.set(year,month,day);
        System.out.println("year " + year + " month " +  month + " day" + day);
        int dayOf = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("value of dayOf " + dayOf);

        switch (dayOf){
            case 1:
                dayOfWeek="SUNDAY";
                break;
            case 2:
                dayOfWeek="MONDAY";
                break;
            case 3:
                dayOfWeek="TUESDAY";
                break;
            case 4:
                dayOfWeek="WEDNESDAY";
                break;
            case 5:
                dayOfWeek="THURSDAY";
                break;
            case 6:
                dayOfWeek="FRIDAY";
                break;
            case 7:
                dayOfWeek="SATURDAY";
                break;
        }
        return dayOfWeek;
    }
}
