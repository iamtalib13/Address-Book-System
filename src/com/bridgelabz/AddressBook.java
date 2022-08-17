package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact contacts = new Contact();

    public void addNewContact() {
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
    }

    public void ShowContact() {
        System.out.println("First Name : " + contacts.getFirstName());
        System.out.println("Last Name : " + contacts.getLastName());
        System.out.println("Address : " + contacts.getAddress());
        System.out.println("City : " + contacts.getCity());
        System.out.println("State : " + contacts.getState());
        System.out.println("Zip Code : " + contacts.getZipCode());
        System.out.println("Phone Number : " + contacts.getPhoneNo());
        System.out.println("EMail ID : " + contacts.getEmail());
    }
}
