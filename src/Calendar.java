import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Calendar {
    public static boolean isValidDate(int day, int year) {
        if (day < 1 || day > 366) {
            return false;
        }
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0; //чи високосний
        if (day > 365 && !isLeapYear) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day;
        int year;

        System.out.println("Enter a number for the day: ");
        day = in.nextInt();
        System.out.println("Enter a number for the year: ");
        year = in.nextInt();

        if (isValidDate(day, year)) {
            LocalDate date = LocalDate.ofYearDay(year, day);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d MMMM, yyyy, EEEE");
            String formattedDate = date.format(dateFormatter);
            System.out.println(formattedDate);
        } else {
            System.out.println("Invalid date input.");
        }
    }
}


