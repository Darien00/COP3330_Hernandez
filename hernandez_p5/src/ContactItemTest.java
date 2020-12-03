import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactItemTest {


    @Test
    void getFirstName() {
        ContactItem contact1 = new ContactItem("darien", "darien@ucf.edu", "786-380-6851", "hernandez");
        assertEquals("darien", contact1.getFirstName());

    }

    @Test
    void setFirstName() {
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        contact1.setFirstName("Happy");
        assertEquals("Happy", contact1.getFirstName());
    }

    @Test
    void getLastName() {
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        assertEquals("Hernandez", contact1.getLastName());
    }

    @Test
    void setLastName() {
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        contact1.setLastName("Bruh");
        assertEquals("bruh", contact1.getLastName());
    }

    @Test
    void getEmail() {
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        assertEquals("darie@ucf.edu", contact1.getEmail());
    }

    @Test
    void setEmail() {
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        contact1.setEmail("darien@ucf.edu");
        assertEquals("darien@ucf.edu", contact1.getEmail());
    }

    @Test
    void getPhoneNumber() {
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        assertEquals("786-380-6851", contact1.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        contact1.setPhoneNumber("786-111-1111");
        assertEquals("786-111-1111", contact1.getPhoneNumber());
    }

    @Test
    void testToString() {
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        assertEquals("Name: Darien Hernandez\n phone number 786-380-6851\n email :darie@ucf.edu", contact1.toString());
    }

    @Test
    void creationFailsWithAllBlankValues(){
        ContactItem contact1 = new ContactItem("", "", "","");
    }

    @Test
    void creationSucceedsWithBlankEmail(){
        ContactItem contact1 = new ContactItem("Darien", "", "786-380-6851", "Hernandez");
    }
    @Test
    void creationSucceedsWithBlankFirstName(){
        ContactItem contact1 = new ContactItem("", "darie@ucf.edu", "786-380-6851", "Hernandez");
    }

    @Test
    void creationSucceedsWithBlankLastName(){
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "");
    }

    @Test
    void creationSucceedsWithBlankPhone(){
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "", "Hernandez");
    }

    @Test
    void creationSucceedsWithNonBlankValues(){
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
    }

    @Test
    void editingFailsWithAllBlankValues(){
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        contact1.setFirstName("");
        contact1.setLastName("");
        contact1.setPhoneNumber("");
        contact1.setEmail("");
    }

    @Test
    void editingSucceedsWithBlankEmail(){
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        contact1.setEmail("");
    }

    @Test
    void editingSucceedsWithBlankFirstName(){
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        contact1.setFirstName("");
    }

    @Test
    void editingSucceedsWithBlankLastName(){
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        contact1.setLastName("");
    }

    @Test
    void editingSucceedsWithBlankPhone(){
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        contact1.setPhoneNumber("");
    }

    @Test
    void editingSucceedsWithNonBlankValues(){
        ContactItem contact1 = new ContactItem("Darien", "darie@ucf.edu", "786-380-6851", "Hernandez");
        contact1.setFirstName("cookier");
        contact1.setLastName("monster");
        contact1.setPhoneNumber("888-888-8888");
        contact1.setEmail("cookieMonster@chipsahooy.com");
    }
}