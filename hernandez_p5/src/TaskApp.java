import java.util.Scanner;

public class TaskApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        TaskList list = new TaskList();
        int listCounter = 0;
        int choice = -1;//user choice

        while(choice != 8){

            System.out.println("List Operation Menu");
            System.out.println("---------");
            System.out.println("1) view the list");
            System.out.println("2) add an item");
            System.out.println("3) edit an item");
            System.out.println("4) remove an item");
            System.out.println("5) mark an item as completed");
            System.out.println("6) unmark an item as completed");
            System.out.println("7) save the current list");
            System.out.println("8) quit to the main menu");


            choice = input.nextInt();

            switch (choice){
                case 1:
                    list.viewList();
                    break;

                case 2:
                    list.addTask();

                    break;

                case 3:
                    list.editItem();
                    break;


                case 4:
                    list.removeItem();
                    break;


                case 5:
                    list.markComplete();
                    break;

                case 6:
                    list.unMarkCompleted();
                    break;

                case 7:
                    break;

                case 8:
                    break;

            }
        }


    }
}
