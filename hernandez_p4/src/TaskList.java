import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class TaskList {

    ArrayList<TaskItem> tasks = new ArrayList<>();
    ArrayList<TaskItem> completedTask = new ArrayList<>();
    ArrayList<TaskList> uncompletedTask = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void viewList(){

        for(int i = 0 ; i < tasks.size(); i++){
            System.out.printf(" %d) %s Task %d %s ",i,tasks.get(i).dueDate, i + 1,tasks.get(i).getDescription());
        }
    }

    public void addItem(){
        System.out.print("Task title: ");
        String titleInput = input.nextLine();
        System.out.print("Task description: ");
        String descriptionInput = input.nextLine();
        System.out.print("Task due date(YYYY-MM-DD): ");
        String dateInput = input.nextLine();

        tasks.add(new TaskItem(titleInput, dateInput ,descriptionInput));

    }

    public void editItem(){
        System.out.println();
        System.out.print("Which task will you edit?");
        int taskNumber = input.nextInt();
        System.out.printf("Enter a new title for task %d: ", taskNumber);
        String taskinput = input.next();
        tasks.get(taskNumber).setTitle(taskinput);
        System.out.printf("Enter a new description for task %d: ", taskNumber);
        taskinput = input.next();
        tasks.get(taskNumber).setDescription(taskinput);
        System.out.printf("Enter a new task due date (YYYY-MM-DD) for task %d: ", taskNumber);
        taskinput = input.next();
        tasks.get(taskNumber).setDescription(taskinput);


    }

    public void removeItem(){
        System.out.print("Which task will you remove? ");
        int taskNumber = input.nextInt();
        tasks.remove(taskNumber);
    }

    public void markCompleted(){

        System.out.print("Which tasks will you mark as completed?");
        int taskinput = input.nextInt();

        completedTask.add(new TaskItem(tasks.get(taskinput).getTitle(), tasks.get(taskinput).getDueDate(), tasks.get(taskinput).getDescription()));
    }

    public void unMarkCompleted(){
        System.out.print("Which tasks will you unmark as completed?");
        int taskinput = input.nextInt();

        completedTask.remove(taskinput);
    }

    public void saveFile(){
        System.out.print("Enter the file name:");
        String fileName = input.next();
        File myObj = new File(fileName);

        for(int i = 0 ; i < tasks.size(); i++){
            myObj.canWrite(" %d) %s Task %d %s ",i,tasks.get(i).dueDate, i + 1,tasks.get(i).getDescription());
        }
    }






}
