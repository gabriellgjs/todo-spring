package com.todospring.repositories;

import com.todospring.domain.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    public Task findTaskById(Long id);
}
