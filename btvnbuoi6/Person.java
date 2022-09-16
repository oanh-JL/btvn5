package btvnbuoi6;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    static Scanner scanner = new Scanner(System.in);
    private String name;
    private LocalDate dateOfBirth;
    private String job;

    public Person() {
    }

    public Person(String name, LocalDate dateOfBirth, String job) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.job = job;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Person.scanner = scanner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void inputPerson() {
        System.out.println("Enter name : ");
        name = scanner.nextLine();
        System.out.println("Enter date of birth : ");
        dateOfBirth = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter occupation : ");
        job = scanner.nextLine();
    }

    public boolean testAge() {
        if (LocalDate.now().getYear() - dateOfBirth.getYear() < 18) {
            return true;
        } else {
            return false;
        }
    }

    public String outputInd() {
        return "Name = " + name + ", date of birth = " + dateOfBirth + ", job = " + job;
    }
}
