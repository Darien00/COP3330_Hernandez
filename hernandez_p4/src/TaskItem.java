public class TaskItem {

    String dueDate;
    String title;
    String description;

    public TaskItem(String title,String dueDate, String description ){
        this.dueDate = dueDate;
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }





    public void setDueDate(String dueDate){
        this.dueDate = dueDate;


    }

    public String getDueDate(){
        return dueDate;
    }
}
