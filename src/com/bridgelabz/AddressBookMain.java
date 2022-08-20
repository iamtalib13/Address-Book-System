package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book System Problem.");

        int choice;

        do {
            System.out.println("***** ADDRESS BOOK MANAGEMENT *****");
            System.out.println("1. ADD NEW ADDRESSBOOK");
            System.out.println("2. EDIT ADDRESSBOOK");
            System.out.println("3. DELETE ADDRESSBOOK");
            System.out.println("4. DISPLAY ADDRESSBOOKS");
            System.out.println("5. SELECT ADDRESSBOOK");
            System.out.println("6. EXIT");
            System.out.println("Please Select the Operation Number : ");
            choice = AddressBookNew.userInput();

            switch (choice) {
                case 1:
                    AddressBookNew.addNewAddressBook();    //Adding New Address Book to System
                    break;
                case 2:
                    //Edit Address Book Details
                    //addressBook.editContact();
                    break;
                case 3:
                    AddressBookNew.deleteAddressBook();    //Delete the Address Book Details
                    break;
                case 4:
                    AddressBookNew.displayAddressBooks();  //Show Contact Details
                    break;
                case 5:
                    AddressBookNew.selectAddressBook();
                    break;
                case 6:
                    System.out.println("Thank You for using Address Book System.");
                    break;
                default:
                    System.out.println("Please Select the Operation between 1 to 6 only.");
                    break;
            }
        }while( choice != 6 );
    }
}