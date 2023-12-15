package codinginterviewquestions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeExample
{
    public static void main(String args[])
    {
        //get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: "+ currentDate);
        // Get the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time :"+currentTime);
        //Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: "+currentDateTime);
        //Create a date
        LocalDate date = LocalDate.of(2023, Month.JANUARY,26);
        System.out.println("Date "+date);
        //Add days to a date
        LocalDate datePlusDays = date.plusDays(5);
        System.out.println("Date plus 5 days: "+ datePlusDays);
        //subtract months from a date
        LocalDate dateMinusMonths = date.minusMonths(2);
        System.out.println("Date minus 2 months: "+ dateMinusMonths);

    }
}
