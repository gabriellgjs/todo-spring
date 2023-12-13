package com.todospring.controllers;

import com.todospring.domain.task.Task;
import com.todospring.dtos.TaskDTO;
import com.todospring.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<Task> createTask (@RequestBody TaskDTO task) {
        Task newTask = this.taskService.createTask(task);

        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Task>> getTasks () {
        return new ResponseEntity<>(this.taskService.getAllTasks(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return this.taskService.getTaskById(id).orElse(null);
    }

    @PatchMapping("/{id}")
    public Task toggleStatus(@PathVariable Long id) {
        return this.taskService.toggleStatusTask(id);
    }

    @PutMapping("/{id}")
    public Task changeDescription(@PathVariable Long id, @RequestBody TaskDTO newDescription) {
        return this.taskService.changeDescriptionTask(id, newDescription.description());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteTask(@PathVariable Long id) {
        this.taskService.deleteTask(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
