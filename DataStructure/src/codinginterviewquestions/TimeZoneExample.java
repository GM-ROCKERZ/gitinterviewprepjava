package codinginterviewquestions;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneExample
{
    public static void main(String args[])
    {
        //Create a LocalDateTime object representing local time
        LocalDateTime localDateTime = LocalDateTime.parse("2023-01-27T09:00:00");
        //get the local time zone
        ZoneId localZone = ZoneId.systemDefault();
        //convert local time to GMT
        LocalDateTime zdt = LocalDateTime.from(localDateTime.atZone(localZone).withZoneSameInstant(ZoneId.of("GMT")));
        //format the output
        String output = zdt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("Local Time: " + localDateTime);
        System.out.println("GMT Time: "+output);

    }
}
