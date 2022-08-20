package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);
    int choice;

    ArrayList<Contact> contactList = new ArrayList<>();


    public void addNewContact() {
        Contact contacts = new Contact();
        System.out.println("Enter the Contact Details -");
        System.out.println("Enter the First Name :");
        contacts.setFirstName(sc.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastName(sc.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());
        System.out.println("Enter the City :");
        contacts.setCity(sc.next());
        System.out.println("Enter the State :");
        contacts.setState(sc.next());
        System.out.println("Enter the Zip Code :");
        contacts.setZipCode(sc.next());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNo(sc.next());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(sc.next());
        contactList.add(contacts);
    }


    public void displayContact() {
        for (Contact contact : contactList) {
            if (contact.getFirstName() == null) {
                System.out.println("Contact Details Not Available");
            } else {
                System.out.println("Contact Details -");

                System.out.println(contact.getFirstName() + " | " + contact.getLastName() + " | " + contact.getAddress() + " | " +
                        contact.getCity() + " | " + contact.getState() + " | " + contact.getZipCode() + " | " + contact.getPhoneNo() + " | "
                        + contact.getEmail());
                System.out.println("------------------------------------------------------------------------");
            }
        }
    }

    public void editContact() {

        System.out.println("Enter the First Name : ");
        String firstName = sc.next();


        boolean isAvailable = false;
        for (Contact contact : contactList) {
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                isAvailable = true;
                System.out.println("Enter the Last Name :");
                contact.setLastName(sc.next());
                System.out.println("Enter the Address :");
                contact.setAddress(sc.next());
                System.out.println("Enter the City :");
                contact.setCity(sc.next());
                System.out.println("Enter the State :");
                contact.setState(sc.next());
                System.out.println("Enter the Zip Code :");
                contact.setZipCode(sc.next());
                System.out.println("Enter the Phone Number :");
                contact.setPhoneNo(sc.next());
                System.out.println("Enter the EMail ID :");
                contact.setEmail(sc.next());
                break;
            }
        }
        if (!isAvailable) {
            System.out.println("Contact Number Not Found.");
        }
    }

    public void deleteContact() {

        System.out.println("Enter the First Name : ");
        String firstName = sc.next();


        boolean isAvailable = false;
        for (Contact contact : contactList) {
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                isAvailable = true;
                contactList.remove(contact);
                System.out.println("Contact Deleted.");
                break;
            }
        }
        if (!isAvailable) {
            System.out.println("Contact Number Not Found.");
        }
    }

    public void contactOptions(AddressBook addressBook) {

        do {
            System.out.println("***** ADDRESS BOOK MANAGEMENT *****");
            System.out.println("1. ADD NEW CONTACT\n2. EDIT CONTACT\n3. DELETE CONTACT" +
                    "\n4. DISPLAY CONTACT\n5. EXIT");
            System.out.println("Please Select the Operation Number : ");
            choice = addressBook.sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addNewContact();    //Adding New Contact Details
                    break;
                case 2:
                    addressBook.editContact();  //Edit Contact Details
                    break;
                case 3:
                    addressBook.deleteContact();    //Delete the Contact Details
                    break;
                case 4:
                    addressBook.displayContact();   //Show Contact Details
                    break;
                case 5:
                    System.out.println("Thank You for Using Address Book.");
                    break;
                default:
                    System.out.println("Please Select the Operation between 1 to 5 only.");
                    break;
            }
        } while (choice != 5);
    }
}