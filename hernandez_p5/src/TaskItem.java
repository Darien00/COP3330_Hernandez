public class TaskItem {
    String title;
    String description;
    private Date due_date;
    boolean complete = false;

    public TaskItem(String title, String description, Date due_date){

        if(title.length() <=0 || title == null){
            throw new IllegalArgumentException("String can not be empty or Null");
        }
        if(description.length() <0){
            throw new IllegalArgumentException("String cannot be negative");

        }

        this.due_date = due_date;
        this.title = title;
        this.description = description;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.length() <=0 || title == null){
            throw new IllegalArgumentException("String can not be empty or Null");
        }
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public void setComplete(boolean complete){
        this.complete = complete;
    }

    @Override
    public String toString() {

        if(complete == true) {
            return ("***[" + due_date + "]" + title + ":" + description);
        }

        return ("[" + due_date + "]" + title + ":" + description);
    }
}
