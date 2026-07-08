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
                    break;
                case 3:
                    changeStatusbyName(getTitle());
                    break;
                case 4:
                    changeStatusbyId(getId());
                    break;
                case 5:
                    printActiveTasks();
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
        String title = scanner.next().toLowerCase();

        System.out.print("Task contentini kiriting: ");
        String content = scanner.next();

        Task task = new Task();
        task.setTitle(title);
        task.setContent(content);
        task.setId(+1);
        return task;
    }

    public void addToArray(Task task){
        if (taskArray.length == currentIndex){
            Task [] newArr = new Task[currentIndex * 2];
            for (int i = 0; i < taskArray.length; i++){
                newArr[i] = taskArray[i];
            }
            taskArray = newArr;
            System.out.print("Task qoshildi!");
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

    public String getQueryName(){
        System.out.print("Task title ini kiriting: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public int getStatusNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Statusni kiriting (1. Done, 2. Pending, 0. Qilinmadi):");
        return scanner.nextInt();
    }

    public String getTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Task titleni kiriting ");
        return scanner.next().trim().toLowerCase();
    }

    public String checkStatusbyNum(int num){
        if (num > 0 && num < 3){
            if (num == 1) {
                return "Done ✅";
            } else if (num == 2) {
                return "pending";
            } else if (num == 0) {
                return "Cancelled ⛔";
            }else {
                return " ";
            }
        }else {
            return " ";
        }
    }

    public void changeStatusbyName(String title){
        boolean isFound = true;
        for (int i = 0; i < taskArray.length; i++){
            Task task = taskArray[i];

            if(task != null && task.findTitle(title)){
                task.setStatus(checkStatusbyNum(getStatusNum()));
            }
            isFound = false;
        }
        if (!isFound){
            System.out.println("Bunday nomli Task topilmadi! Mazgi!");
        }
    }

    public int getId(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Task ID raqamini kiriting: ");
        return scanner.nextInt();
    }

    public void changeStatusbyId(int id){
        boolean isFound = false;

        for (int i = 0; i < taskArray.length; i++){
            Task task = taskArray[i];

            if (task != null && task.checkId(id)){
                System.out.println("Massivdagi task ID: " + task.getId() + " | Biz qidirayotgan ID: " + id);
                isFound = true;
                task.setStatus(checkStatusbyNum(getStatusNum()));
            }
            break;
        }
        if (!isFound){
            System.out.println("Bunday id li task mavjud emas. Mazgi!!");
        }

    }

    public void printActiveTasks(){
        for(int i = 0; i < taskArray.length; i++){
            Task task = taskArray[i];
            if (task.getStatus().equals("done")){
                System.out.printf("%-15s | %-30s | %-10s%n", "TITLE", "CONTENT", "STATUS");
                System.out.println("------------------------------------------------------------------");
                System.out.printf("%-18s | %-18s | %-6s%n", task.getTitle(), task.getContent(), task.getStatus());
            }else {
                System.out.print("Aktiv Tasklar topilmadi!");
            }
        }
    }
}