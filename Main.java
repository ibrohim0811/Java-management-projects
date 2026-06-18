import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        boolean b = true;
        Contact [] contactArray = new Contact[10];
        int currentIndex = 0;

        menu();
        int n = getMenuNumber();

        switch (n){
            case 1:
                Contact contact = AddContact();
                if (isValidContact(contact)){
                    contactArray[currentIndex] = contact;
                    currentIndex++;
                    System.out.println("Contact Saved !");

                }

            case 2:
                break;
            case 3:
                break;
            case 0:
                b = false;
                break;
            default:
                System.out.println("Please choose correct number. Mazgi!");
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

    public static void menu(){
        System.out.println("**Menu**");
        System.out.println("1. Add Contact");
        System.out.println("2. Add List ");
        System.out.println("3. Search");
        System.out.println("4. Delete Contact");
        System.out.println("5. Exit");
    }

    public static int getMenuNumber(){
        System.out.print("Choose menu: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        return n;
    }

}