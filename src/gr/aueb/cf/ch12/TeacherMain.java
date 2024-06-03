package gr.aueb.cf.ch12;

/**
 * Client class that creates a {@link Teacher}
 * Instance and populates its state.
 */
public class TeacherMain {
    public static void main(String[] args) {
        Teacher elon = new Teacher();
        Teacher anna = new Teacher(2, "Anna", "G.");

        elon.setId(1);
        elon.setFirstname("Elon");
        elon.setLastname("M.");

        System.out.println("Elon's State");
        System.out.println("id: " +elon.getId());
        System.out.println("Firstname: " + elon.getFirstname());
        System.out.println("Lastname: " + elon.getLastname());

        System.out.println("Annas's State");
        System.out.println("id: " +anna.getId());
        System.out.println("Firstname: " + anna.getFirstname());
        System.out.println("Lastname: " + anna.getLastname());
    }
}
