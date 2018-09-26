package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.TodoRepository;
import com.greenfoxacademy.todo.models.Todo;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class TodoController {

    TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping("/todo/add")
    public String getAddTodo() {
        return "addNewTodo";
    }

    @PostMapping("/todo")
    public String addTodo(String todo) {
        if (todo.equals("")) {
            return "redirect:/todo/add";
        }
        todoRepository.save(new Todo(todo, false, false));
        return "redirect:/todo";
    }

    @RequestMapping("/todo")
    public String isAktive( Model model, @RequestParam(value = "isActive", required = false) String isActive){
        List<Todo> doneTodos = new ArrayList<>();
        Iterable<Todo> allTodos = todoRepository.findAll();
        List<Todo> sortedTodos = Streamable.of(allTodos).stream()
                                                        .sorted(Comparator.comparingLong(todo -> todo.getId()))
                                                        .collect(Collectors.toList());

        for (Todo todo : todoRepository.findAll()){
            if(!todo.isDone()) {
                doneTodos.add(todo);
            }
        }
        if (isActive == null) {
            model.addAttribute("todoList", sortedTodos);
        } else if (isActive.equals("true")) {
            model.addAttribute("todoList", doneTodos);
        }
        return "index";
    }
}
