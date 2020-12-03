import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskItemTest {

    @Test
    void constructorFailsWithInvalidDueDate(){
        Date date1 = new Date(13,42, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);
    }

    @Test
    void constructorFailsWithInvalidTitle(){
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("", "My first task", date1);
    }

    @Test
    void constructorSucceedsWithValidDueDate(){
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);
    }

    @Test
    void constructorSucceedsWithValidTitle(){
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);
    }

    @Test
    void editingDescriptionSucceedsWithExpectedValue(){
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);

        task1.setDescription("My second description");

    }

    @Test
    void editingDueDateFailsWithInvalidDateFormat(){
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);
        date1.setYear(2020);
        date1.setMonth(1);
        date1.setDay(34);
    }

    @Test
    void editingDueDateSucceedsWithExpectedValue(){
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);

        date1.setYear(2020);
        date1.setMonth(3);
        date1.setDay(22);
    }

    @Test
    void editingTitleFailsWithEmptyString(){
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);
        task1.setTitle("");
    }

    @Test
    void editingTitleSucceedsWithExpectedValue(){
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);
        task1.setTitle("Task2");
    }


    @Test
    void getTitle() {
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);
        assertEquals("Task1", task1.getTitle());
    }

    @Test
    void setTitle() {
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);

        task1.setTitle("Task2");
        assertEquals("Task2", task1.getTitle());
    }

    @Test
    void getDescription() {
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);
        assertEquals("My first task", task1.getDescription());
    }

    @Test
    void setDescription() {
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);
        task1.setDescription("my second task");
        assertEquals("my second task", task1.getDescription());
    }

    @Test
    void getDue_date() {
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);
        task1.getDue_date();
        assertEquals("2020-9-12", task1.getDue_date());
    }

    @Test
    void setDue_date() {
        Date date1 = new Date(9,12, 2020);
        TaskItem task1 = new TaskItem("Task1", "My first task", date1);
    }

    @Test
    void setComplete() {
    }

    @Test
    void testToString() {
    }
}