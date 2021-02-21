package ITscoolMegacom;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MinimumDate {
    Scanner scan = new Scanner(System.in);
    public void startMinDate() throws ParseException {
        Date[]dates = new Date[10];
        SimpleDateFormat date = new SimpleDateFormat("HH:mm");
        for(int i=0; i< dates.length; i++){
            System.out.println("enter time (hh:mm): ");
            String d = scan.nextLine();
            dates[i] = date.parse(d);
        }
        Date minDate = dates[0];
        for(int i = 0; i< dates.length; i++){
            if(dates[i].before(minDate)){
                minDate = dates[i];
            }
        }
        System.out.println();
        System.out.println("min time: ");
        System.out.println(date.format(minDate));

    }
}
