package homework5;

import java.util.Scanner;


public class ApplicationLibrary {
    public static void main(String[] args) throws Exception {
        BorrowedCard[] borrowCard;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of borrowed cards :");
        int numberCard = scanner.nextInt();
        scanner.nextLine();
        borrowCard = new BorrowedCard[numberCard];
        for (int i = 0; i < numberCard; i++) {
            borrowCard[i] = new BorrowedCard();
            System.out.println("Enter loan card information " + (i + 1));
            borrowCard[i].input();
        }
        for (int i = 0; i < numberCard; i++) {
            System.out.println(borrowCard[i].toString());
        }
        int count = 0;
        for (int i = 0; i < numberCard; i++) {
            if (borrowCard[i].getLopHoc().equals("CNTT2")){
                count++;
            }
        }
        System.out.println("The loan card number of class IT2 is " + count);
    }
}
