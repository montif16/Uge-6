package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;

    //Constructor
    public Customer (String firstName, String lastName, String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }
    //override toString method for our own
    @Override
    public String toString(){
        return "Kundeoplysninger: \n" +
                "Fornavn: " + firstName + "\n" +
                "Efternavn: " + lastName + "\n" +
                "Brugernavn: " + username + "\n" +
                "ID: " + id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getUsername(){
        return username;
    }
}
