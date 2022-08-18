package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    Scanner sc4 = new Scanner(System.in);
    Scanner sc5 = new Scanner(System.in);
    Scanner sc6 = new Scanner(System.in);
    Scanner sc7 = new Scanner(System.in);
    Scanner sc8 = new Scanner(System.in);
    Contact contacts = new Contact();

    public void addNewContact() {
        System.out.println("Enter the First Name :");
        contacts.setFirstName(sc1.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastName(sc2.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(sc3.next());
        System.out.println("Enter the City :");
        contacts.setCity(sc4.next());
        System.out.println("Enter the State :");
        contacts.setState(sc5.next());
        System.out.println("Enter the Zip Code :");
        contacts.setZipCode(sc6.next());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNo(sc7.next());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(sc8.next());
    }

    public void showContact() {
        System.out.println("First Name : " + contacts.getFirstName());
        System.out.println("Last Name : " + contacts.getLastName());
        System.out.println("Address : " + contacts.getAddress());
        System.out.println("City : " + contacts.getCity());
        System.out.println("State : " + contacts.getState());
        System.out.println("Zip Code : " + contacts.getZipCode());
        System.out.println("Phone Number : " + contacts.getPhoneNo());
        System.out.println("EMail ID : " + contacts.getEmail());
    }

    public void editContact() {
        System.out.println("Enter the First Name : ");
        String firstName = sc1.next();

        if (!firstName.equalsIgnoreCase(contacts.getFirstName())) {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        } else {

            System.out.println("Enter the Last Name :");
            contacts.setLastName(sc2.next());
            System.out.println("Enter the Address :");
            contacts.setAddress(sc3.next());
            System.out.println("Enter the City :");
            contacts.setCity(sc4.next());
            System.out.println("Enter the State :");
            contacts.setState(sc5.next());
            System.out.println("Enter the Zip Code :");
            contacts.setZipCode(sc6.next());
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNo(sc7.next());
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(sc8.next());
        }
    }
}
