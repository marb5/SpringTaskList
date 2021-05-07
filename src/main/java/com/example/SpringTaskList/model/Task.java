package com.example.SpringTaskList.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author marcin
 */

@Entity
@Table(name = "tasks")
class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private boolean done;
    
    Task(){
        
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    void setId(int id) {
        this.id = id;
    }

    void setDescription(String description) {
        this.description = description;
    }

    void setDone(boolean done) {
        this.done = done;
    }
    
    
}
