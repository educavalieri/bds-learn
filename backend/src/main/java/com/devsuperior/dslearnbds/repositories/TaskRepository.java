package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entities.Course;
import com.devsuperior.dslearnbds.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
