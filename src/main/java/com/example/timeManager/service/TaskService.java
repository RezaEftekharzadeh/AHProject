package com.example.timeManager.service;

import com.example.timeManager.domain.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    Task createTask(Task task);
    List<Task> allTasks();
    Task updateTask(UUID id, Task task);
    void deleteTask(UUID id);
}
