package com.example.tobias.garritsen_pset5;

import java.util.ArrayList;

//Stores data for a single todo list.
public class ToDoList {

    private ArrayList<ToDoItem> toDoItems = new ArrayList<>();
    private String title;

    public ToDoList(String title, ArrayList<ToDoItem> toDoItems) {
        this.title = title;
        this.toDoItems = toDoItems;
    }

    public ArrayList<ToDoItem> getTaskList() {
        return toDoItems;
    }

    public String getTitle() {
        return title;
    }
}