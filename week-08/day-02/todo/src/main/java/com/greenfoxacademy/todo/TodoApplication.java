package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.models.Todo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        todoRepository.save(new Todo("Complete the todo app", true, true));
        todoRepository.save(new Todo("Drink some water", true, false));
        todoRepository.save(new Todo("Feed the dog", true, false));
        todoRepository.save(new Todo("Run", true, false));
        todoRepository.save(new Todo("Have a shower", true, true));
        todoRepository.save(new Todo("Have launch", true, true));
        todoRepository.save(new Todo("Sleep 30 minutes", false, false));
        todoRepository.save(new Todo("Continue the programing", true, false));
        todoRepository.save(new Todo("Finish the todo App", false, true));
        todoRepository.save(new Todo("Make the lightning talk for tomorrow", false, true));
        todoRepository.save(new Todo("Sleep", false, true));
        todoRepository.save(new Todo("I have to learn Object Relational Mapping", false, true));

        System.out.println(todoRepository.findAll());
    }
}
