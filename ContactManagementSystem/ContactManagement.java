import java.util.ArrayList;
import java.util.Scanner;

public class ContactManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        while (true) {

            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    contacts.add(new Contact(name, phone, email));

                    System.out.println("✅ Contact Added Successfully!");
                    break;

                case 2:

                    if (contacts.isEmpty()) {
                        System.out.println("No Contacts Found.");
                    } else {

                        for (Contact c : contacts) {

                            System.out.println("-----------------------");
                            System.out.println("Name : " + c.name);
                            System.out.println("Phone: " + c.phone);
                            System.out.println("Email: " + c.email);

                        }

                    }

                    break;

                case 3:

                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");

            }

        }

    }

}