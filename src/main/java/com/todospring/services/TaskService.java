package com.todospring.services;

import com.todospring.domain.task.Task;
import com.todospring.dtos.TaskDTO;
import com.todospring.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks() {
        return this.repository.findAll();
    }

    public Task createTask(TaskDTO task) {
        Task newTask = new Task(task);

        this.repository.save(newTask);

        return newTask;
    }
}
