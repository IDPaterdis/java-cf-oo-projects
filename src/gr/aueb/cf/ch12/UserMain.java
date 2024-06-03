package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;

public class UserMain {
    public static void main(String[] args) {
        User user = new User();
        User anna = new User(2, "Anna", "G","anna", "123456", false);


        user.setId(1);
        user.setFirstname("George");
        user.setLastname("D. ");
        user.setUsername("georgegeg");
        user.setPassword("1234566");
        user.setActive(true);

        System.out.println("id: " +user.getId());
        System.out.println("Firstname: " + user.getFirstname());
        System.out.println("Lastname: " + user.getLastname());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
        System.out.println("User Active " + user.isActive());

        System.out.println("Anna id " + anna.getId());
        System.out.printf("Firstname %s, Lastname %s", anna.getFirstname(), anna.getLastname());
        System.out.printf("Username: %s, Password %s ", anna.getUsername(), anna.getPassword());
        System.out.println("Is active: " + anna.isActive());
    }
}
