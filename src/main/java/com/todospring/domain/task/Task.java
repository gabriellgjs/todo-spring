package com.todospring.domain.task;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tasks")
@Table(name = "tasks")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    public Task() {}
}
