package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.TodoRepository;
import com.greenfoxacademy.todo.models.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class TodoController {

    TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    @RequestMapping("/todo")
    public String todos(Model model) {
        model.addAttribute("todoList", todoRepository.findAll());

        return "index";
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


}
