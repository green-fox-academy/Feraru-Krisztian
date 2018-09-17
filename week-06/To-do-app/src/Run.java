import java.util.Scanner;

public class Run {
    public static void processArgs(TaskList tasks) {
        Scanner sc = new Scanner(System.in);

        boolean isRunning = true;
        tasks.help();

        while (isRunning) {
            String command = sc.nextLine();
            switch (command) {
                case "-a":
                    System.out.println("Adds a new task");
                    tasks.addTask();
                    tasks.save();
                    break;
                case "-l":
                    tasks.listOfTheTasks();
                    break;
                case "-r":
                    System.out.println("Chose witch task to remove");
                    tasks.taskNumber();
                    tasks.save();
                    break;
                case "-c":
                    System.out.println("Chose the completed task");
                    tasks.completedTask();
                    tasks.save();
                    break;
                case "-u":
                    System.out.println("Enter the task ID and the new task");
                    tasks.updateTask();
                    tasks.save();
                    break;
                default:
                    tasks.help();
            }
        }
    }
}
