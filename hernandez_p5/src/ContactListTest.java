import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ContactListTest {

    @Test
    void addingItemsIncreasesSize(){

        ArrayList<ContactItem> contactItem = new ArrayList<ContactItem>();
        assertEquals(0, contactItem.size());
        contactItem.add(new ContactItem("Darien", "Darien@ucf.edu", "786-380-6851", "Hernandez"));
        assertEquals(1, contactItem.size());

    }

    @Test
    void editingItemsFailsWithAllBlankValues(){
        ArrayList<ContactItem> contactItem = new ArrayList<ContactItem>();
        contactItem.add(new ContactItem("Darien", "Darien@ucf.edu", "786-380-6851", "Hernandez"));
        contactItem.get(0).setFirstName("");
        contactItem.get(0).setLastName("");
        contactItem.get(0).setPhoneNumber("");
        contactItem.get(0).setEmail("");
    }

    @Test
    void editingItemsFailsWithInvalidIndex(){
        ArrayList<ContactItem> contactItem = new ArrayList<ContactItem>();
        contactItem.add(new ContactItem("Darien", "Darien@ucf.edu", "786-380-6851", "Hernandez"));
        contactItem.get(1).setFirstName("darin");
        contactItem.get(1).setLastName("hernandez");
        contactItem.get(1).setPhoneNumber("786-111-1111");
        contactItem.get(1).setEmail("dars@ucf.edu");
    }

    @Test
    void editingSucceedsWithBlankFirstName(){
        ArrayList<ContactItem> contactItem = new ArrayList<ContactItem>();
        contactItem.add(new ContactItem("Darien", "Darien@ucf.edu", "786-380-6851", "Hernandez"));
        contactItem.get(0).setFirstName("");
        contactItem.get(0).setLastName("hernandez");
        contactItem.get(0).setPhoneNumber("786-111-1111");
        contactItem.get(0).setEmail("dars@ucf.edu");
    }

    @Test
    void editingSucceedsWithBlankLastName(){
        ArrayList<ContactItem> contactItem = new ArrayList<ContactItem>();
        contactItem.add(new ContactItem("Darien", "Darien@ucf.edu", "786-380-6851", "Hernandez"));
        contactItem.get(0).setFirstName("Darien");
        contactItem.get(0).setLastName("");
        contactItem.get(0).setPhoneNumber("786-111-1111");
        contactItem.get(0).setEmail("dars@ucf.edu");
    }

    @Test
    void editingSucceedsWithBlankPhone(){
        ArrayList<ContactItem> contactItem = new ArrayList<ContactItem>();
        contactItem.add(new ContactItem("Darien", "Darien@ucf.edu", "786-380-6851", "Hernandez"));
        contactItem.get(0).setFirstName("Darien");
        contactItem.get(0).setLastName("Hernandez");
        contactItem.get(0).setPhoneNumber("");
        contactItem.get(0).setEmail("dars@ucf.edu");
    }

    @Test
    void editingSucceedsWithNonBlankValues(){
        ArrayList<ContactItem> contactItem = new ArrayList<ContactItem>();
        contactItem.add(new ContactItem("Darien", "Darien@ucf.edu", "786-380-6851", "Hernandez"));
        contactItem.get(0).setFirstName("Darien");
        contactItem.get(0).setLastName("Hernandez");
        contactItem.get(0).setPhoneNumber("786-111-1111");
        contactItem.get(0).setEmail("dars@ucf.edu");
    }

    @Test
    void newListIsEmpty(){
        ArrayList<ContactItem> contactItem = new ArrayList<ContactItem>();
        assertEquals(0, contactItem.size());
    }

    @Test
    void removingItemsDecreasesSize(){
        ArrayList<ContactItem> contactItem = new ArrayList<ContactItem>();
        contactItem.add(new ContactItem("Darien", "Darien@ucf.edu", "786-380-6851", "Hernandez"));
        contactItem.add(new ContactItem("Darien", "Darien@ucf.edu", "786-380-6851", "Hernandez"));
        assertEquals(2, contactItem.size());
        contactItem.remove(1);
        assertEquals(1, contactItem.size());

    }

    @Test
    void removingItemsFailsWithInvalidIndex(){
        ArrayList<ContactItem> contactItem = new ArrayList<ContactItem>();
        contactItem.add(new ContactItem("Darien", "Darien@ucf.edu", "786-380-6851", "Hernandez"));
        contactItem.add(new ContactItem("Darien", "Darien@ucf.edu", "786-380-6851", "Hernandez"));
        contactItem.remove(3);
    }

    @org.junit.jupiter.api.Test
    void viewContacts() {
        assertAll();
    }

    @org.junit.jupiter.api.Test
    void addContact() {
    }

    @org.junit.jupiter.api.Test
    void editContact() {
    }

    @org.junit.jupiter.api.Test
    void removeContact() {
    }
}