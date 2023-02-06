package com.week2.todoManagement.Service;

import com.week2.todoManagement.Entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();
    Todo getTodoById(int id);
    Todo addTodo(Todo todo);
    Todo updateTodo(Todo todo);
    String deleteTodo(int id);
}
