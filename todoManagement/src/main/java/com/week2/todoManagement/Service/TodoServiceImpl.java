package com.week2.todoManagement.Service;

import com.week2.todoManagement.Dao.TodoDao;
import com.week2.todoManagement.Entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoDao todoDao;
    @Override
    public List<Todo> getAllTodos() {
        return todoDao.findAll();

    }

    @Override
    public Todo getTodoById(int id) {
        Optional<Todo> todo = todoDao.findById(id);
        Todo t = null;
        if(todo.isPresent()){
            t=todo.get();
        }else {
            throw new RuntimeException("Todo is not found with id: " + id );

        }
        return t;
    }

    @Override
    public Todo addTodo(Todo todo) {
        todoDao.save(todo);
        return todo;
    }

    @Override
    public Todo updateTodo(Todo todo) {
        todoDao.save(todo);
        return todo;
    }

    @Override
    public String deleteTodo(int id) {
        todoDao.deleteById(id);
        return "Todo task deleted successfully";
    }
}
