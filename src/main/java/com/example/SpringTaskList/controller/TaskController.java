package com.example.SpringTaskList.controller;

import com.example.SpringTaskList.model.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.RepositoryRestController;

/**
 *
 * @author marcin
 */

//dzieki kontrolerowi mozemy zarzadzac naszym modelem (repozytorium), jego danymi
//umozliwia on rowniez wyswietlanie informacji
@RepositoryRestController
class TaskController {
    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
    
    private final TaskRepository repository;
    
    TaskController(final TaskRepository repository) {
        this.repository = repository;
    }
}
