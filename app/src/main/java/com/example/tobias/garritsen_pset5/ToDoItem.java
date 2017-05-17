package com.example.tobias.garritsen_pset5;

//Stores data for a single to-do item.
public class ToDoItem {

    private String title;
    private String checked;

    public ToDoItem(String titleToDo, String checkToDo) {
        title = titleToDo;
        checked = checkToDo;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return checked;
    }

    public void setStatus(String checkToDo) {
        checked = checkToDo;
    }
}