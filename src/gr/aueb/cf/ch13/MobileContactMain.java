package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.model.MobileContact;

public class MobileContactMain {
    public static void main(String[] args) {
        MobileContact alice = new MobileContact("Alice", "w.", "69999999");
        alice.insertContact();

        MobileContact mobileContact = alice.getContactByPhoneNumber();
        System.out.println(mobileContact.contactToString());
    }
}
