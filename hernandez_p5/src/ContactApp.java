import java.util.ArrayList;
import java.util.Scanner;

public class ContactApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContactList list = new ContactList();
        int listCounter = 0;
        int choice = -1;//user choice

        while(choice != 6){

            System.out.println("List Operation Menu");
            System.out.println("---------");
            System.out.println("1) view the list");
            System.out.println("2) add an item");
            System.out.println("3) edit an item");
            System.out.println("4) remove an item");
            System.out.println("5) save the current list");
            System.out.println("6) quit to the main menu");

            choice = input.nextInt();

            switch (choice){
                case 1:
                    list.viewContacts();
                    break;

                case 2:
                    list.addContact();

                    break;

                case 3:
                    list.editContact();
                    break;


                case 4:
                    list.removeContact();
                    break;


                case 6:
                    break;

            }
        }
    }
}
