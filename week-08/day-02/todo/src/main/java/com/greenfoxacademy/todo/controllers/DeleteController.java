package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeleteController {
    TodoRepository todoRepository;

    public DeleteController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/{id}/delete")
    public String deleteAnTodo(@PathVariable Long id) {
        todoRepository.deleteById(id);

        return "redirect:/todo";
    }
}
