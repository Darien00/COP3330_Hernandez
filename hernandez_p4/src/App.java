import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class App {

    public static void listOperationMenu(){
        System.out.println("1) View the list");
        System.out.println("2) add an item");
        System.out.println("3) edit an item");
        System.out.println("4) remove an item");
        System.out.println("5) mark an item as complete");
        System.out.println("6) unmark an item as completed");
        System.out.println("7) save the current list");
        System.out.println("8) quit to main menu");
    }

    public static void mainMenu(){
        System.out.println("1) create a new list");
        System.out.println("2) load an existing list");
        System.out.println("3) quit");
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        /*
        TaskList tasks = new TaskList();

       tasks.viewList();
       tasks.addItem();
       tasks.viewList();
       tasks.editItem();
       tasks.viewList();
       */


       while(true){
           mainMenu();
           choice = input.nextInt();

           if(choice == 1){
               TaskList tasks = new TaskList();
               int flag = 1;
               while(flag != 0){
                   listOperationMenu();
                   choice = input.nextInt();
                   switch (choice){
                       case 1:
                           tasks.viewList();
                           break;

                       case 2:
                           tasks.addItem();
                           break;

                       case 3:
                           tasks.editItem();
                           break;

                       case 4:
                           tasks.removeItem();
                           break;

                       case 5:
                           tasks.markCompleted();
                           break;

                       case 6:
                           tasks.unMarkCompleted();
                           break;

                       case 7:
                           System.out.print("Enter the file name:");
                           String fileName = input.next();
                           File myObj = new File(fileName);


                       case 8:
                           flag = 0;
                           break;
                   }
               }
           }
           if(choice == 2){

           }

           if(choice == 3){
               break;
           }





       }
    }




}
