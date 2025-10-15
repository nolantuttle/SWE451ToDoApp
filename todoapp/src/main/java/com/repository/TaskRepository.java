package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.model.Task;

public interface TaskRepository extends MongoRepository<Task, String> {
    
}
