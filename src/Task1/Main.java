package Task1;
import java.util.ArrayList;




public class Main {

    public static void main(String[] args) {

    /*
    Customer user1 = new Customer("john", "Cena", "johnnyBoi");
    System.out.println(user1.toString());
    */

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "cena" ,"JohnnyBoi"));
        customers.add(new Customer("Hanse", "hansen","bondemand69"));
        customers.add(new Customer("Lise","Lottelund","CutePige123"));

        printCustomers(customers);
        }
    public static void printCustomers(ArrayList<Customer> customers){
        System.out.println("All of our customers: ");
        for (Customer customer : customers){
            System.out.println(customer.toString());
        }
    }
}