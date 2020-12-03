public class ContactItem {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;


    /*
    public ContactItem(String firstName, int phoneNumber, String lastName){
        this(firstName, null,phoneNumber, lastName);
    }
    public ContactItem(String firstName, String email, String lastName){
        this(firstName, email, 0, lastName);
    }
    public ContactItem(String firstName, String email, int phoneNumber){
        this(firstName, email, phoneNumber, null);
    }

    public ContactItem(String phoneNumber, String email ,String lastName){
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
    }
    */


    public ContactItem(String firstName, String email, String phoneNumber, String lastName) {
        if((firstName == null || firstName.length() == 0) && (lastName == null || lastName.length() == 0)  &&
                (email == null || email.length() == 0) && phoneNumber ==null || phoneNumber.length() == 0){
            System.out.println("All values cannot be null or empty");
            throw new IllegalArgumentException();

        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        if((firstName == null || firstName.length() == 0) && (lastName == null || lastName.length() == 0)  &&
                (email == null || email.length() == 0) && phoneNumber ==null || phoneNumber.length() == 0){
            System.out.println("All values cannot be null or empty");
            throw new IllegalArgumentException();

        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if((firstName == null || firstName.length() == 0) && (lastName == null || lastName.length() == 0)  &&
                (email == null || email.length() == 0) && phoneNumber ==null || phoneNumber.length() == 0){
            System.out.println("All values cannot be null or empty");
            throw new IllegalArgumentException();

        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if((firstName == null || firstName.length() == 0) && (lastName == null || lastName.length() == 0)  &&
                (email == null || email.length() == 0) && phoneNumber == null || phoneNumber.length() == 0){
            System.out.println("All values cannot be null or empty");
            throw new IllegalArgumentException();

        }
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if((firstName == null || firstName.length() == 0) && (lastName == null || lastName.length() == 0)  &&
                (email == null || email.length() == 0) && phoneNumber ==null || phoneNumber.length() == 0){
            System.out.println("All values cannot be null or empty");
            throw new IllegalArgumentException();

        }
        this.phoneNumber = phoneNumber;
    }

    public String toString(){

        return "Name:"+ firstName + lastName + "\n" + "phone number" + phoneNumber
                + "\n" +
                "email :" + email;
    }
}
