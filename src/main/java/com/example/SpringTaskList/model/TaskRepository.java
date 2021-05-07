package com.example.SpringTaskList.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author marcin
 */
@RepositoryRestResource
interface TaskRepository extends JpaRepository<Task, Integer> {
    
}
