package gr.aueb.cf.ch12;


import gr.aueb.cf.ch12.model.User1;
import gr.aueb.cf.ch12.model.UserCredentials;

public class MainTask {
    public static void main(String[] args) {
        User1 user = new User1();
        UserCredentials cred = new UserCredentials(1, "jaypat", "1234569");

        user.setId(1);
        user.setFirstname("Jay");
        user.setLastname("P. ");

        System.out.println("id: " + user.getId());
        System.out.println("Firstname: " + user.getFirstname());
        System.out.println("Lastname: " + user.getLastname());
        System.out.println("Cred id " + cred.getId());
        System.out.printf("Username: %s, Password %s ", cred.getUsername(), cred.getPassword());

    }
}
