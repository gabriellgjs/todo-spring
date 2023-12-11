package com.todospring.dtos;

import com.todospring.domain.task.TaskStatus;

public record TaskDTO(String description, TaskStatus status) {
}
