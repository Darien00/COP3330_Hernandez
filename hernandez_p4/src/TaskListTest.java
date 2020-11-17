import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TaskListTest {
    ArrayList<TaskItem> tasks = new ArrayList<>();
    ArrayList<TaskItem> completedTask = new ArrayList<>();
    ArrayList<TaskList> uncompletedTask = new ArrayList<>();

    @org.junit.jupiter.api.Test
    void viewList() {
        tasks.get(0).setDueDate("11-16-2020");
        tasks.get(0).setDescription("my first task");
        tasks.get(0).setTitle("Task1");
        for(int i = 0; i < tasks.size(); i++){
           assertEquals("%d", i);
           assertEquals("Task1", tasks.get(i).getTitle() );
           assertEquals("11-16-2020", tasks.get(i).getDueDate());
           assertEquals("my first task", tasks.get(i).getDescription());

        }

    }



    @org.junit.jupiter.api.Test
    void addItem() {
        tasks.add(new TaskItem("Task1", "11-16-2020" ,"my first task"));
        assertEquals("Task1", tasks.get(0).getTitle() );
        assertEquals("11-16-2020", tasks.get(0).getDueDate());
        assertEquals("my first task", tasks.get(0).getDescription());
    }

    @org.junit.jupiter.api.Test
    void editItem() {
        int taskNumber =0;
        tasks.add(new TaskItem("Task1", "11-16-2020" ,"my first task"));
        tasks.get(taskNumber).setDueDate("11-10-2020");
        tasks.get(taskNumber).setDescription("my second task");
        tasks.get(taskNumber).setTitle("Task2");
        assertEquals("Task2", tasks.get(0).getTitle() );
        assertEquals("11-10-2020", tasks.get(0).getDueDate());
        assertEquals("my second task", tasks.get(0).getDescription());

    }

    @org.junit.jupiter.api.Test
    void removeItem() {
        tasks.add(new TaskItem("Task1", "11-16-2020" ,"my first task"));
        tasks.remove(0);
        try{
            assertEquals("Task2", tasks.get(0).getTitle() );
            assertEquals("11-10-2020", tasks.get(0).getDueDate());
            assertEquals("my second task", tasks.get(0).getDescription());
        }
        catch (IndexOutOfBoundsException e){

        }

    }

    @org.junit.jupiter.api.Test
    void markCompleted() {
        tasks.add(new TaskItem("Task1", "11-16-2020" ,"my first task"));
        completedTask.add(new TaskItem(tasks.get(0).getTitle(), tasks.get(0).getDueDate(), tasks.get(0).getDescription()));

        assertEquals("Task2", completedTask.get(0).getTitle() );
        assertEquals("11-10-2020", completedTask.get(0).getDueDate());
        assertEquals("my second task", completedTask.get(0).getDescription());
    }

    @org.junit.jupiter.api.Test
    void unMarkCompleted() {
        tasks.add(new TaskItem("Task1", "11-16-2020" ,"my first task"));
        completedTask.add(new TaskItem(tasks.get(0).getTitle(), tasks.get(0).getDueDate(), tasks.get(0).getDescription()));

        assertEquals("Task2", completedTask.get(0).getTitle() );
        assertEquals("11-10-2020", completedTask.get(0).getDueDate());
        assertEquals("my second task", completedTask.get(0).getDescription());

        completedTask.remove(0);
        try{
            assertEquals("Task2", completedTask.get(0).getTitle() );
            assertEquals("11-10-2020", completedTask.get(0).getDueDate());
            assertEquals("my second task", completedTask.get(0).getDescription());
        }
        catch (IndexOutOfBoundsException e){

        }




    }
}