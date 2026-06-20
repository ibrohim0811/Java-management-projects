import java.util.Scanner;

public class Main{

    static Contact [] contactArray = new Contact[10];
    static int currentIndex = 0;

    public static void main(String[] args){
        boolean b = true;
        menu();
        int n = getMenuNumber();

        switch (n){
            case 1:
                Contact contact = AddContact();
                AddToArray(contact);

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

            case 0:
                b = false;
                break;
            default:
                System.out.println("Please choose correct number. Mazgi!");
        }
    }

    public static void AddToArray(Contact contact){
        if (!isValidContact(contact)){
            return;
        }

        if (isPhoneExists(contact.phone)){
            System.out.println("Phone number already exists. Mazgi!");
            return;
        }

        if (currentIndex == contactArray.length){
            Contact [] newArr = new Contact[currentIndex * 2];
            for (int i = 0; i < contactArray.length; i++){
                newArr[i] = contactArray[i];
            }
            contactArray = newArr;
        }

        contactArray[currentIndex] = contact;
        currentIndex++;
        System.out.println("Contact Saved !");


    }

    public static void printContactList(){
        for (Contact c : contactArray) {
            if (c != null) {
                System.out.printf(c.name + " " + c.surname + " :" + c.phone);
            }
        }
    }

    public static boolean isValidContact(Contact contact){
        if (contact.name == null || contact.name.trim().length() < 3){
            System.out.println("Contact's name is invalid !");
            return false;

        } if (contact.surname == null || contact.surname.trim().length() < 3) {
            System.out.println("Contact's Surname is invalid !");
            return false;

        } if (contact.phone.trim().length() != 12 || !contact.phone.startsWith("998") ){
            System.out.println("Contact's phone is invalid ! \nStart with 998");
            return false;
        }

        char [] phoneArr = contact.phone.toCharArray();

        for (char c: phoneArr){
            if (!Character.isDigit(c)){
                System.out.println("Contact should be numbers !");
                return false;
            }
        }
        return true;
    }

    public static Contact AddContact(){
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

    public static String getQuery(){
        System.out.println("Enter query: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void search(String query){
        query = query.toLowerCase();
        for (Contact c: contactArray){
            if (c == null){
                continue;
            }
            if(c != null){
                if (c.name.toLowerCase().contains(query) || c.surname.toLowerCase().contains(query) || c.phone.contains(query)){
                    System.out.println(c.name + " " + c.surname + " " + c.phone);
                }else {
                    System.out.println("Contact not found!");
                }
            }
        }
    }

    public static void menu(){
        System.out.println("**Menu**");
        System.out.println("1. Add Contact");
        System.out.println("2. Add List ");
        System.out.println("3. Search");
        System.out.println("4. Delete Contact");
        System.out.println("5. Exit");
    }

    public static String deleteContact(){
        System.out.print("Enter phone: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void deleteContactFromArray(String phone){
        for (int i = 0; i < contactArray.length; i++){
            Contact contact = contactArray[i];
            if (contact != null && contact.phone.equals(phone)) {
                contactArray[i] = null;
                System.out.println("Phone deleted !");
                break;
            }
        }
    }

    public static int getMenuNumber(){
        System.out.print("Choose menu: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        return n;
    }

    public static boolean isPhoneExists(String phone){
        for (Contact c: contactArray){
            if (c != null && c.phone.equals(phone)){
                return true;
            }
        }
        return false;
    }

}