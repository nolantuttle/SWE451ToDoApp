package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.TaskRepository;
import com.model.Task;

@Service
public class TaskService {
    
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(String description) {
        return taskRepository.save(new Task(null, description));
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
