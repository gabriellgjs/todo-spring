package com.todospring.services;

import com.todospring.domain.task.Task;
import com.todospring.domain.task.TaskStatus;
import com.todospring.dtos.TaskDTO;
import com.todospring.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Task> getTaskById(Long id) {
        return this.repository.findById(id);
    }

    public Task toggleStatusTask(Long id) {
        Task task = this.repository.findTaskById(id);

        task.setStatus(task.getStatus().equals(TaskStatus.ACTIVE)? TaskStatus.COMPLETED : TaskStatus.ACTIVE);

        this.repository.save(task);

        return task;
    }

    public Task changeDescriptionTask(Long id, String description) {
        Task task = this.repository.findTaskById(id);

        System.out.println(description);
        task.setDescription(description);

        this.repository.save(task);

        return task;
    }

    public void deleteTask(Long id) {
        this.repository.deleteById(id);
    }
}
