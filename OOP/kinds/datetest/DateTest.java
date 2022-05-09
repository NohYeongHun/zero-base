package kinds.datetest;

import java.util.Calendar;
import java.util.Date;

public class DateTest{

    public static void main(String[] args) {
        
        Date today = Calendar.getInstance().getTime();
        System.out.println(today);

        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDate.format(today));
        
    }
}