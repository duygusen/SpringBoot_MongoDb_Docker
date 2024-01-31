package com.example.docker_mongodb.repository;

import com.example.docker_mongodb.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {
}
