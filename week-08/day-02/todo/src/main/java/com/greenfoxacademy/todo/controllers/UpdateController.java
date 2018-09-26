package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.TodoRepository;
import com.greenfoxacademy.todo.models.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UpdateController {
    TodoRepository todoRepository;

    public UpdateController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/{id}/update")
    public String getUpdate(@PathVariable Long id, Model model) {
        Todo todo = todoRepository.findById(id).get();
        model.addAttribute("name", todo.getToDo());
        model.addAttribute("isDone", todo.isDone());
        model.addAttribute("isUrgent", todo.isUrgent());
        model.addAttribute("todo", todo);
        return "update";
    }

    @PostMapping("/{id}/update")
    public String postUpdate(@PathVariable Long id, Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo";
    }

}
