package com.infinity.addressbook;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Welcome message for user
		 */
		System.out.println("Welcome to AddressBook Program");
		AddressBook addressBook = new AddressBook();
		addressBook.addContact();
		addressBook.showContact();
	}

}
