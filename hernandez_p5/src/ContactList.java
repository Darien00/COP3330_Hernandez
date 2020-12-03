import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


public class ContactList {

    ArrayList<ContactItem>contactItem = new ArrayList<ContactItem>();
    //ArrayList<Date>dates = new ArrayList<Date>();
    Scanner input = new Scanner(System.in);

    void viewContacts(){
        for(int i =0; i < contactItem.size(); i++){
            System.out.printf("%d) %s%n",i ,contactItem.get(i).toString());
        }
    }

    void addContact(){
        //String skip = "\n";
        //input.nextLine();

        System.out.print("First name:");
        String firstName = input.nextLine();
        System.out.print("Last name:");
        String lastName = input.nextLine();
        System.out.print("phone number (xxx-xxx-xxxx):");
        String phoneNumber = input.nextLine();
        System.out.print("Email address (x@y.z):");
        String email = input.nextLine();
        //input.nextLine();

        contactItem.add(new ContactItem(firstName, email, phoneNumber, lastName));
    }

    void editContact(){
        boolean continueLoop = true;
        viewContacts();
        int contactNumber;

        do{

            System.out.print("which contact will you edit? ");
            contactNumber = input.nextInt();
            if(contactItem.size() > contactNumber && contactItem.get(contactNumber)!= null){

                input.nextLine();
                System.out.printf("Enter a new first name for contact %d:", contactNumber);
                String firstName = input.nextLine();
                System.out.printf("Enter a new last name for contact %d:", contactNumber);
                String lastName = input.nextLine();
                System.out.printf("Enter a new phone number(xxx-xxx-xxxx) for contact %d:", contactNumber );
                String phoneNumber = input.nextLine();
                System.out.printf("Enter a new email address (x@y.z for contact %d:", contactNumber);
                String email = input.nextLine();

                contactItem.get(contactNumber).setFirstName(firstName);
                contactItem.get(contactNumber).setLastName(lastName);
                contactItem.get(contactNumber).setPhoneNumber(phoneNumber);
                contactItem.get(contactNumber).setEmail(email);
                continueLoop = false;

            }
            else{
                System.out.print("Cant remove item invalid index try again \n");
                continueLoop = true;
            }



        }while(continueLoop);



    }

    void removeContact(){

        viewContacts();
        boolean continueLoop = true;
        int contactNumber;


        do{

            System.out.print("which contact will you remove? ");
            contactNumber = input.nextInt();
            if(contactItem.size() > contactNumber && contactItem.get(contactNumber)!= null){
                contactItem.remove(contactNumber);
                continueLoop = false;

            }
            else{
                System.out.print("Cant remove item invalid index try again \n");
                continueLoop = true;
            }



        }while(continueLoop);




    }



}
