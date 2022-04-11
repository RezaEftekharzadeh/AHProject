package com.example.timeManager.repository;

import com.example.timeManager.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface TaskRepository extends JpaRepository<Task, UUID> {
}
