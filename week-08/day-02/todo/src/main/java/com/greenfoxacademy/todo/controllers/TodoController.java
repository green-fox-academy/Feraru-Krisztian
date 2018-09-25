package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.TodoRepository;
import com.greenfoxacademy.todo.models.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TodoController {

    TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
//    @RequestMapping("/todo")
//    public String todos(Model model) {
//        model.addAttribute("todoList", todoRepository.findAll());
//
//        return "index";
//    }

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
        for (Todo todo : todoRepository.findAll()){
            if(!todo.isDone()) {
                doneTodos.add(todo);
            }
        }
        if (isActive == null) {
            model.addAttribute("todoList", todoRepository.findAll());
        } else if (isActive.equals("true")) {
            model.addAttribute("todoList", doneTodos);
        }
        return "index";
    }

}
