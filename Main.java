import Person.Person;
import TaskManager.TaskManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        projectChooser();


    }

    public static void projectChooser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.ContactManager\n2.TaskManager");
        System.out.print("Projectni tanlang: ");
        Integer choose = scanner.nextInt();
        if (choose == 1){
            ContactManager.ContactManager contactManager = new ContactManager.ContactManager();
            contactManager.start();
        } else if (choose == 2) {
            TaskManager taskManager = new TaskManager();
            taskManager.start();
        }else {
            System.out.println("Iltimos faqat menyudagi raqamlarni kiriting!");
        }
    }

}
