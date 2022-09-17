package homework5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import static exercisesoop.ApplicationStudent.scanner;

public class BorrowedCard extends Student{
    private String id;
    private LocalDate borrowDate;
    private LocalDate term;
    private String numberOfBook;

    public BorrowedCard() {

    }

    public BorrowedCard(String id, LocalDate borrowDate, LocalDate term, String numberOfBook) {
        this.id = id;
        this.borrowDate = borrowDate;
        this.term = term;
        this.numberOfBook = numberOfBook;
    }

    public BorrowedCard(String fullName, String studentCode, LocalDate dateOfBirth, int age, String lopHoc, String id, LocalDate borrowDate, LocalDate term, String numberOfBook) {
        super(fullName, studentCode, dateOfBirth, age, lopHoc);
        this.id = id;
        this.borrowDate = borrowDate;
        this.term = term;
        this.numberOfBook = numberOfBook;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getTerm() {
        return term;
    }

    public void setTerm(LocalDate term) {
        this.term = term;
    }

    public String getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(String numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public void input() {
        super.inputStudent();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coupon id: ");
        id = scanner.nextLine();
        do {
            System.out.println("Enter loan date : ");
            borrowDate = LocalDate.parse(scanner.nextLine());
        } while (borrowDate.isBefore(this.getDateOfBirth()));

        do {
            System.out.println(" Enter payment term : ");
            term = LocalDate.parse(scanner.nextLine());
        } while (term.isBefore(borrowDate));
        System.out.println("Enter the bookstore number : ");
        numberOfBook = scanner.nextLine();
    }
    @Override
    public String toString() {
        return "id: " + id + ", borrowDate: " + borrowDate + ", term: " + term + ", number of book: " + numberOfBook + ", " + super.toString();
    }
}
