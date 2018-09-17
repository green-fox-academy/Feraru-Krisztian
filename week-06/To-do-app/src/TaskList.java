import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static java.time.LocalDateTime.now;

public class TaskList {

    private ArrayList<Task> myToDoList;
    private Path path;

    public TaskList() {
        this.myToDoList = new ArrayList<>();
        this.path = Paths.get("tasks.txt");
        boolean fileExists = Files.exists(path);
        if (fileExists) {
            try {
                Files.lines(path).forEach(line -> {
                    String[] lineParts = line.split(";");
                    int idValue = Integer.parseInt(lineParts[0]);
                    String name = lineParts[1];
                    LocalDateTime creationTime = LocalDateTime.parse(lineParts[2]);
                    LocalDateTime completedTime = null;
                    if (!lineParts[3].equals("null")) {
                        completedTime = LocalDateTime.parse(lineParts[3]);
                    }
                    boolean done = Boolean.parseBoolean(lineParts[4]);
                    Task task = new Task(name, idValue, creationTime, completedTime, done);
                    myToDoList.add(task);
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void save() {
        try {
            if (!Files.exists(path)) {
                Path file = Files.createFile(path);
            }
            List<String> lines = myToDoList.stream().map(toDo -> toDo.getId() + ";" + toDo.getName() + ";" + toDo.getCreatedAt() + ";" + toDo.isCompleted() + ";" + toDo.isDone())
                    .collect(Collectors.toList());
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void help() {
        System.out.println("Command line arguments: ");
        System.out.println(" -l   Lists all the tasks");
        System.out.println(" -a   Adds a new task");
        System.out.println(" -r   Removes an task");
        System.out.println(" -c   Completes an task");
        System.out.println(" -u   Update a task");
    }

    public void addTask() {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        int taskId;
        LocalDateTime createdAt = now();
        LocalDateTime completedAt = null;
        boolean done = false;
        Optional<Task> maxTask = myToDoList.stream()
                .max(Comparator.comparingInt(task -> task.getId()));
        if (maxTask.isPresent()) {
            taskId = maxTask.get().getId() + 1;
        } else {
            taskId = 1;
        }
        myToDoList.add(new Task(sc, taskId, createdAt, completedAt, done));
    }

    public void updateTask() {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        String[] splitedSc = sc.split(" ");
        int taskId = Integer.parseInt(splitedSc[0]);
        String name = "";
        for (int i = 1; i < splitedSc.length; i++) {
            name += splitedSc[i] + " ";
        }
        for (int i = 0; i < myToDoList.size(); i++) {
            if (taskId == myToDoList.get(i).getId()) {
                myToDoList.get(i).setName(name);
            }
        }
    }

    public void listOfTheTasks() {
        for (int i = 0; i < myToDoList.size(); i++) {
            System.out.println(myToDoList.get(i));
        }
    }

    public void taskNumber() {
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        int index;
        for (int i = 0; i < myToDoList.size(); i++) {
            if (sc == myToDoList.get(i).getId()) {
                index = i;
                myToDoList.remove(index);
            }
        }
    }

    public void completedTask() {
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        int index;
        for (int i = 0; i < myToDoList.size(); i++) {
            if (sc == myToDoList.get(i).getId()) {
                index = i;
                myToDoList.get(index).setDone(true);
                myToDoList.get(index).setCompletedAt();
            }
        }
    }
}
