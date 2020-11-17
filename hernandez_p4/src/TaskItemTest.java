import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskItemTest {


    @Test
    void getDescription() {
        TaskItem item1 = new TaskItem("Task1", "11-16-2020", "my first task");
        assertEquals("my first task", item1.getDescription());
    }

    @Test
    void setDescription(String s1) {


    }

    @Test
    void getTitle() {
        TaskItem item1 = new TaskItem("Task1", "11-16-2020", "my first task");
        assertEquals("Task1", item1.getTitle() );
    }

    @Test
    void setTitle() {


    }

    @Test
    void setDueDate() {
    }

    @Test
    void getDueDate() {
        TaskItem item1 = new TaskItem("Task1", "11-16-2020", "my first task");
        assertEquals("11-16-2020", item1.getDueDate() );
    }
}