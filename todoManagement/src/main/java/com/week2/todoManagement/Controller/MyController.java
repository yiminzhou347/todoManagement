package com.week2.todoManagement.Controller;

import com.week2.todoManagement.Entity.Todo;
import com.week2.todoManagement.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    TodoService todoService;

    @GetMapping("/")
    public String home(){
        return "Welcomne to use todo App";
    }

    @GetMapping("/todos")
    public List<Todo> getAllTodo(){
        return todoService.getAllTodos();
    }
    @GetMapping("/todos/{id}")
    public Todo getTodoById(@PathVariable int id){
        return todoService.getTodoById(id );
    }
    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }
    @PutMapping("/todos")
    public Todo update(@RequestBody Todo todo){
        return todoService.updateTodo(todo);
    }

    @DeleteMapping("/todos/{id}")
    public String delete(@PathVariable int id){
        return todoService.deleteTodo(id);
    }
}