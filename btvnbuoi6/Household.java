package btvnbuoi6;

public class Household extends Person {
    // house hold ko chứa những thuộc tính của person 
    private int numberOfMember;
    private int apartmentNumber;
    private Person[] people = new Person[10];

    public Household() {
    }

    public Household(int numberOfMember, int apartmentNumber, Person[] people) {
        this.numberOfMember = numberOfMember;
        this.apartmentNumber = apartmentNumber;
        this.people = people;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public void inputHousehold() {
        System.out.println("Enter house number : ");
        this.apartmentNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the number of members :");
        this.numberOfMember = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < this.numberOfMember; i++) {
            System.out.println("Second member " + (i + 1));
            this.people[i] = new Person();
            this.people[i].inputPerson();
        }
    }

    public void outputHousehold() {
        System.out.println("Apartment number : " + this.apartmentNumber);
        for (int i = 0; i < this.numberOfMember; i++) {
            System.out.println(this.people[i].outputInd());
        }
    }

    public int calculateElectricBill(int day) {
        return this.numberOfMember * 2000 * day;
    }

    public int numberChild() {
        int count = 0;
        for (int i = 0; i < this.numberOfMember; i++) {
            if (this.people[i].testAge()) {
                count++;
            }
        }
        return count;
    }
}
