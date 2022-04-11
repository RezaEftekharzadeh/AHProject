package com.example.timeManager.service;

import com.example.timeManager.domain.Task;
import com.example.timeManager.repository.TaskRepository;
import com.example.timeManager.service.TaskService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImp implements TaskService {
    @Autowired
    TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> allTasks() {
        return null;
    }

    @Override
    public Task updateTask(UUID id, Task task) {
        return null;
    }

    @Override
    public void deleteTask(UUID id) {

    }
}
