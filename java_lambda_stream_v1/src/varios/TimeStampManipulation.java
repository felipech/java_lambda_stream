package varios;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeStampManipulation {


    public static void main(String[] args) {

        Date timestamp = Calendar.getInstance(TimeZone.getTimeZone("America/Santiago")).getTime();

        Instant instant = Instant.now();
        long timeStampMillis = instant.toEpochMilli();


        System.out.println("timestamp " + timeStampMillis);

    }

}
