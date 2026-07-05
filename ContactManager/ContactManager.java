package ContactManager;

import java.util.Scanner;

public class ContactManager {
    Contact [] contactArray = new Contact[10];
    int currentIndex = 0;

    public void start(){
        boolean b = true;

        while (b) { // Dastur to'xtab qolmasligi uchun tsikl ichiga olindi
            menu();
            int n = getMenuNumber();

            switch (n) {
                case 1:
                    Contact contact = AddContact();
                    AddToArray(contact);
                    break; // break qo'yildi, yo'qsa case 2 ham ishlab ketadi
                case 2:
                    printContactList();
                    break;
                case 3:
                    String query = getQuery();
                    search(query);
                    break;
                case 4:
                    String phone = deleteContact();
                    deleteContactFromArray(phone);
                    break;
                case 5:
                case 0:
                    b = false;
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Please choose correct number. Mazgi!");
            }
        }
    }

    public void AddToArray(Contact contact) {
        if (!isValidContact(contact)) {
            return;
        }

        if (isPhoneExists(contact.phone)) {
            System.out.println("Phone number already exists. Mazgi!");
            return;
        }

        if (currentIndex == contactArray.length) {
            Contact [] newArr = new Contact[currentIndex * 2];
            for (int i = 0; i < contactArray.length; i++) {
                newArr[i] = contactArray[i];
            }
            contactArray = newArr;
        }

        contactArray[currentIndex] = contact;
        currentIndex++;
        System.out.println("ContactManager.Contact Saved !");
    }

    public void printContactList() {
        System.out.println("\n--- ContactManager.Contact List ---");
        boolean hasContacts = false;
        for (Contact c : contactArray) {
            if (c != null) {
                System.out.println(c.name + " " + c.surname + " : " + c.phone);
                hasContacts = true;
            }
        }
        if (!hasContacts) {
            System.out.println("ContactManager.Contact list is empty.");
        }
    }

    public boolean isValidContact(Contact contact) {
        if (contact.name == null || contact.name.trim().length() < 3) {
            System.out.println("ContactManager.Contact's name is invalid !");
            return false;
        }
        if (contact.surname == null || contact.surname.trim().length() < 3) {
            System.out.println("ContactManager.Contact's Surname is invalid !");
            return false;
        }
        if (contact.phone.trim().length() != 12 || !contact.phone.startsWith("998")) {
            System.out.println("ContactManager.Contact's phone is invalid ! \nStart with 998");
            return false;
        }

        char [] phoneArr = contact.phone.toCharArray();
        for (char c: phoneArr) {
            if (!Character.isDigit(c)) {
                System.out.println("ContactManager.Contact should be numbers !");
                return false;
            }
        }
        return true;
    }

    public Contact AddContact() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter surname: ");
        String surname = scanner.next();

        System.out.print("Enter phone number (with 998): ");
        String phone = scanner.next();

        Contact contact = new Contact();
        contact.name = name;
        contact.surname = surname;
        contact.phone = phone;

        return contact;
    }

    public String getQuery() {
        System.out.print("Enter query: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void search(String query) {
        query = query.toLowerCase();
        boolean found = false;
        for (Contact c: contactArray) {
            if (c == null) {
                continue;
            }
            if (c.name.toLowerCase().contains(query) || c.surname.toLowerCase().contains(query) || c.phone.contains(query)) {
                System.out.println(c.name + " " + c.surname + " " + c.phone);
                found = true;
            }
        }
        if (!found) {
            System.out.println("ContactManager.Contact not found!");
        }
    }

    public void menu() {
        System.out.println("\n**Menu**");
        System.out.println("1. Add ContactManager.Contact");
        System.out.println("2. Print List");
        System.out.println("3. Search");
        System.out.println("4. Delete ContactManager.Contact");
        System.out.println("5. Exit");
    }

    public String deleteContact() {
        System.out.print("Enter phone: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void deleteContactFromArray(String phone) {
        for (int i = 0; i < contactArray.length; i++) {
            Contact contact = contactArray[i];
            if (contact != null && contact.phone.equals(phone)) {
                contactArray[i] = null;
                System.out.println("Phone deleted !");
                break;
            }
        }
    }

    public int getMenuNumber() {
        System.out.print("Choose menu: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public boolean isPhoneExists(String phone) {
        for (Contact c: contactArray) {
            if (c != null && c.phone.equals(phone)) {
                return true;
            }
        }
        return false;
    }
}
