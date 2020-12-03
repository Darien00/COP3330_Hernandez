import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskListTest {

    @Test
    void addingItemsIncreasesSize(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);
        assertEquals(0, taskItem.size());

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        assertEquals(1, taskItem.size());
    }

    @Test
    void completingTaskItemChangesStatus(){


    }

    @Test
    void completingTaskItemFailsWithInvalidIndex(){

    }
    @Test
    void editingItemDescriptionFailsWithInvalidIndex(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        taskItem.get(1).setDescription("Task uno");

        assertEquals("Task uno", taskItem.get(0).getDescription());

    }
    @Test
    void editingItemDescriptionSucceedsWithExpectedValue(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        taskItem.get(0).setDescription("Task uno");

        assertEquals("Task uno", taskItem.get(0).getDescription());

    }

    @Test
    void editingItemDueDateSucceedsWithExpectedValue(){
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);

        date1.setYear(2020);
        date1.setMonth(3);
        date1.setDay(22);
    }

    @Test
    void editingItemTitleFailsWithEmptyString(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        taskItem.get(0).setTitle("");

        assertEquals("Task2", taskItem.get(0).getTitle());

    }

    @Test
    void editingItemTitleFailsWithInvalidIndex(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        taskItem.get(1).setTitle("Task2");

        assertEquals("Task2", taskItem.get(0).getTitle());
    }

    @Test
    void editingItemTitleSucceedsWithExpectedValue(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        taskItem.get(0).setTitle("Task2");

        assertEquals("Task2", taskItem.get(0).getTitle());
    }
    @Test
    void editingTaskItemDueDateFailsWithInvalidDateFormat(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));

        Date date2 = new Date(13,32, 2020);
        taskItem.get(0).setDue_date(date2);

    }

    @Test
    void editingTaskItemDueDateFailsWithInvalidIndex(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        taskItem.get(1).setDue_date(date1);

    }

    @Test
    void editingTaskItemDueDateFailsWithInvalidYYYMMDD(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));

        Date date2 = new Date(13,32, 2020);
        taskItem.get(0).setDue_date(date2);

    }

    @Test
    void gettingItemDescriptionFailsWithInvalidIndex(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        assertEquals("my first task", taskItem.get(1).getDescription());

    }
    @Test
   void gettingItemDescriptionSucceedsWithValidIndex(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        assertEquals("my first task", taskItem.get(0).getDescription());

    }

    @Test
    void gettingItemDueDateFailsWithInvalidIndex(){

        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        assertEquals("2020-9-12", taskItem.get(1).getDue_date());

    }

    @Test
    void gettingItemDueDateSucceedsWithValidIndex(){

        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        assertEquals("2020-9-12", taskItem.get(0).getDue_date());

    }

    @Test
    void gettingItemTitleFailsWithInvalidIndex(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        assertEquals("Task1", taskItem.get(1).getTitle());
    }

    @Test
    void gettingItemTitleSucceedsWithValidIndex(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        assertEquals("Task1", taskItem.get(0).getTitle());
    }

    @Test
    void newListIsEmpty(){



    }

    @Test
    void removingItemsDecreasesSize(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);
        assertEquals(0, taskItem.size());

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        assertEquals(1, taskItem.size());

        taskItem.remove(0);
        assertEquals(0, taskItem.size());
    }

    @Test
    void removingItemsFailsWithInvalidIndex(){
        ArrayList<TaskItem> taskItem = new ArrayList<TaskItem>();
        Date date1 = new Date(9,12, 2020);
        assertEquals(0, taskItem.size());

        taskItem.add(new TaskItem("Task1", "my first task", date1));
        assertEquals(1, taskItem.size());

        taskItem.remove(2);
        //assertEquals(0, taskItem.size());
    }

    @Test
    void savedTaskListCanBeLoaded(){

    }

    @Test
    void uncompletingTaskItemChangesStatus(){

    }
    @Test
    void uncompletingTaskItemFailsWithInvalidIndex(){

    }



}