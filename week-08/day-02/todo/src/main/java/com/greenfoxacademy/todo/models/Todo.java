package com.greenfoxacademy.todo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String toDo;
    private boolean done;
    private boolean urgent;

    public Todo() {}

    public Todo(String toDo, boolean done, boolean urgent) {
        this.toDo = toDo;
        this.done = done;
        this.urgent = urgent;
    }

    public Todo(String toDo) {
        this.toDo = toDo;
        this.done = false;
        this.urgent = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", todo='" + toDo + '\'' +
                ", done='" + done + '\'' +
                ", urgent=" + urgent +
                '}';
    }
}
