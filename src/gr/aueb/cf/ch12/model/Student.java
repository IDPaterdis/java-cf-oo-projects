package gr.aueb.cf.ch12.model;

/**
 * Java Bean - POJO (plain old java object
 */

public class Student {
    private int id;
    private String firstname;
    private String lastname;

    /**
     * Default Constractor. Polpulates the state of the instances based on specific values that are given,
     */
    public Student(){

    }

    /**
     * Overloaded Cosntructor.
     * @param id
     * the id of the {@link Student}.
     * @param firstname
     * the firstname of the {@link Student}.
     * @param lastname
     * the lastname of the {@link Student}
     */
    public Student(int  id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getLastname(){
        return lastname;
    }
}
