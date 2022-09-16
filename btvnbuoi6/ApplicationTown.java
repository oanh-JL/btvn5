package btvnbuoi6;

import java.util.Scanner;


public class ApplicationTown {
    public static void main(String[] args) {
        Household[] household;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter household number : ");
        int number = scanner.nextInt();
        scanner.nextLine();
        household = new Household[number];
        for (int i = 0; i < household.length; i++) {
            household[i] = new Household();
            System.out.println("Household information " + (i + 1));
            household[i].inputHousehold();
        }
        System.out.println("Information of households just entered :");
        for (int i = 0; i < household.length; i++) {
            System.out.println("Second household " + (i + 1));
            household[i].outputHousehold();
        }

        int day;
        int money;
        System.out.println("Enter the number of months : ");
        int month = scanner.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            day = 31;
        } else {
            day = 30;
        }
        for (int i = 0; i < household.length; i++) {
            System.out.println("Household's amount " + (i + 1) + ": ");
            money = household[i].getNumberOfMember() * 2000 * day;
            System.out.println(money);
        }

        int maxBill = 0;
        for (int i = 0; i < household.length; i++) {
            maxBill = household[0].calculateElectricBill(day);
            if (maxBill < household[i].calculateElectricBill(day)) {
                maxBill = household[i].calculateElectricBill(day);
            }
        }
        for (int i = 0; i < household.length; i++) {
            if (maxBill == household[i].getNumberOfMember() * 2000 * day) {
                System.out.println("Second household " + (i + 1) + "use the most electricity bill");
            }
        }
        int count = 0;
        for (int i = 0; i < household.length; i++) {
            count += household[i].numberChild();
        }
        System.out.println("The number of children is : " + count);
    }
}
