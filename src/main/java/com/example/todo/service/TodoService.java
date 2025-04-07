package com.example.todo.service;

import com.example.todo.model.TodoItem;
import com.example.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<TodoItem> getAllTodos() {
        return repository.findAll();
    }

    public TodoItem addTodo(TodoItem todo) {
        return repository.save(todo);
    }

    public TodoItem updateTodo(Long id, TodoItem updatedTodo) {
        Optional<TodoItem> optionalTodo = repository.findById(id);
        if (optionalTodo.isPresent()) {
            TodoItem existingTodo = optionalTodo.get();
            existingTodo.setTask(updatedTodo.getTask());
            existingTodo.setCompleted(updatedTodo.isCompleted());
            return repository.save(existingTodo);
        }
        return null;
    }

    public void deleteTodo(Long id) {
        repository.deleteById(id);
    }
}
