package datetime;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Import date : ");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        date = date.plusDays(1);
        System.out.println("The next day : " + date);
    }
}
