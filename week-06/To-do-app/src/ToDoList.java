public class ToDoList {
    public static void main(String[] args) {
        TaskList tasks = new TaskList();

        if (args.length == 0) {
            tasks.help();
        } else {
            Run.processArgs(tasks);
        }
    }
}
