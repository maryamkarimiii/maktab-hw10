import ir.maktab.entity.Customer;
import ir.maktab.entity.User;

import java.util.Scanner;

public class MainHandler {
 public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----hello welcome to our internet market---- /n " +
                "1-register /n 2-logIn /n 3-logOut");
        switch (Integer.parseInt(scanner.nextLine())){
            case 1:

        }
    }
    public static void registerMenu(){
        Customer customer=new Customer();
        System.out.println("enter your first name:");
        customer.setFirstName(scanner.nextLine());
        System.out.println("enter your last name");
        customer.setLastName(scanner.nextLine());
        System.out.println("enter your userName");

    }
}
