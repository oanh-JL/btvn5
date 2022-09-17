package homework5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private String fullName;
    private String studentCode;
    private LocalDate dateOfBirth;
    private int age;
    private String lopHoc;

    public Student() {
    }

    public String getFullName() {
        return fullName;
    }

    public Student(String fullName, String studentCode, LocalDate dateOfBirth, int age, String lopHoc) {
        this.fullName = fullName;
        this.studentCode = studentCode;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.lopHoc = lopHoc;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first and last name : ");
        this.fullName = scanner.nextLine();
        System.out.print("Enter student code :");
        this.studentCode = scanner.nextLine();
        do {
            System.out.println("Nhập ngày sinh : ");
            dateOfBirth = LocalDate.parse(scanner.nextLine());
            age = LocalDate.now().getYear() - dateOfBirth.getYear();
        } while (age <= 0);
        System.out.print("enter age: ");
        age = scanner.nextInt();
        System.out.print("Enter class : ");
        this.lopHoc = scanner.nextLine();
        scanner.nextLine();
    }

    public String toString() {
        return "Name: " + fullName + ", date of birth: " + dateOfBirth + ", age: " + age + ", Class: " + lopHoc;
    }
}
