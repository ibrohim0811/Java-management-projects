package TaskManager;

import java.util.Scanner;

public class TaskManager {
    Task [] taskArray = new Task[10];
    int currentIndex = 0;

    public void start(){
        boolean b = true;
        while(b) {
            menu();
            int n = getMenuNumber();
            switch (n) {
                case 1:
                    Task task = addTask();
                    addToArray(task);
                    break;
                case 2:
                    printAlltask();
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    b = false;
                    break;
                default:
                    System.out.println("Please choose correct number. Mazgi!");
            }
        }
    }

    public Task addTask(){
        System.out.print("Task ning titleni kiriting: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.next();

        System.out.print("Task contentini kiriting: ");
        String content = scanner.next();

        Task task = new Task();
        task.setTitle(title);
        task.setContent(content);
        return task;
    }

    public void addToArray(Task task){
        if (taskArray.length == currentIndex){
            Task [] newArr = new Task[currentIndex * 2];
            for (int i = 0; i < taskArray.length; i++){
                newArr[i] = taskArray[i];
            }
            taskArray = newArr;
        }
        taskArray[currentIndex] = task;
        currentIndex++;
    }

    public static void menu(){
        System.out.println("TaskManager Loyihasi:\n1. Add Task\n2. TaskList\n3. Change status by name\n4. Cahnge status by id\n5. Active TaskList\n 0. Exit");
    }

    public int getMenuNumber() {
        System.out.print("Choose menu: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void printAlltask() {
        String border = "+-----+-----------------+------------------------------------------+----------+%n";

        System.out.printf(border);
        System.out.printf("| %-75s |%n", "                                TASK LIST");
        System.out.printf(border);
        System.out.printf("| %-3s | %-15s | %-40s | %-8s |%n", "ID", "Title", "Content", "Status");
        System.out.printf(border);

        for (Task task : taskArray) {
            if (task != null) {
                System.out.printf("| %-3d | %-15s | %-40s | %-8s |%n",
                        task.getId(),
                        task.getTitle(),
                        task.getContent(),
                        task.getStatus());
            }
        }
        System.out.printf(border);
    }


}