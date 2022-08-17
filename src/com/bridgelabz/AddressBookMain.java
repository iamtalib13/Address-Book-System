package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book System Problem.");

        int option = 0;

        AddressBook addressBook = new AddressBook();

        do {
            System.out.println("1. ADD NEW PERSON DETAILS");
            System.out.println("2. SHOW PERSON DETAILS");
            System.out.println("3. EXIT ADDRESS BOOK");

            System.out.println("Please Select the Program : ");
            option = addressBook.sc.nextInt();

            switch (option) {
                case 1:
                    addressBook.addNewContact();
                    break;
                case 2:
                    addressBook.ShowContact();
                    break;
                case 3:
                    System.out.println("Exit - Thank You ");
                    break;
                default:
                    System.out.println("Please Select the Valid Program");
                    break;
            }
        } while (option != 3);

    }
}