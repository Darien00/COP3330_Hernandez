import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TaskList {
    static int counter=0;
    ArrayList<TaskItem>taskItems = new ArrayList<TaskItem>();
    ArrayList<Date>dates = new ArrayList<Date>();
    Scanner input = new Scanner(System.in);

    void viewList(){

        for(int i =0; i < taskItems.size(); i++){
           System.out.printf("%d) %s%n",i ,taskItems.get(i).toString());
        }
    }


    void addTask(){


        boolean continueLoop = true;
    do {
        try {
            System.out.print("Task title:");
            String title = input.nextLine();
            System.out.print("Task description:");
            String description = input.nextLine();
            System.out.print("Task due date(YYYY-MM-DD): ");
            int year = input.nextInt();
            int month = input.nextInt();
            int day = input.nextInt();

            dates.add(new Date(month, day, year));
            taskItems.add(new TaskItem(title, description, dates.get(counter)));
            continueLoop = false;
        } catch (InputMismatchException inputMismatchException) {
            System.err.printf("%nException: %s%n", inputMismatchException);
        }
    }while(continueLoop);
       counter++;


    }

    void editItem(){

        viewList();
        System.out.print("which task will you edit?");
        int task = input.nextInt();
        try{
            taskItems.get(task);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println(" response that you would like to edit is out of bounds");
        }


        input.nextLine();

        System.out.printf("Enter a new title for task %d:", task);
        String title = input.nextLine();
        System.out.printf("Enter a new description for task %d:", task);
        String description = input.nextLine();
        System.out.printf("Enter a new task due (YYYY-MM-DD) for task %d:", task);
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        dates.get(task).setDay(day);
        dates.get(task).setMonth(month);
        dates.get(task).setYear(year);

        taskItems.get(task).setDescription(description);
        taskItems.get(task).setTitle(title);
        //taskItems.get(task).setDue_date();

    }

    void removeItem(){

        viewList();
        boolean continueLoop = true;

        do{
            System.out.print("which task will you remove? ");
            int task = input.nextInt();
            //taskItems.remove(task);

            if(taskItems.size() > task && taskItems.get(task)!= null){
                taskItems.remove(task);
                continueLoop = false;
            }

        }while(continueLoop);
        //ystem.out.print("which task will you remove? ");
        //int task = input.nextInt();
        //taskItems.remove(task);
    }

    void markComplete(){
        viewList();
        boolean continueLoop = true;
        do{


            System.out.print("which task will you mark as complete ");
            int task  = input.nextInt();
            if(taskItems.size() > task && taskItems.get(task)!= null){
                taskItems.get(task).setComplete(true);
                continueLoop = false;
            }
        }while(continueLoop);

        //taskItems.get(task).setComplete(true);
    }

    void unMarkCompleted() {
        viewList();
        boolean continueLoop = true;
        do {


            System.out.print("which task will you unmark as complete ");
            int task = input.nextInt();
            if (taskItems.size() > task && taskItems.get(task) != null) {
                taskItems.get(task).setComplete(false);
                continueLoop = false;
            }
        } while (continueLoop);

        //taskItems.get(task).setComplete(true);
    }
}
