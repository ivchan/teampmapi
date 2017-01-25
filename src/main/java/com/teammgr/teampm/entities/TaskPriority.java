package com.teammgr.teampm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by ivanchan on 25/1/2017.
 */
@Entity
@Table(name = "pm_priority")
public class TaskPriority implements Serializable {
    @Id
    @Column(name = "priority_id")
    private int priority;

    @Column(name = "priority_name", length = 100)
    private String priorityName;

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getPriorityName() {
        return priorityName;
    }

    public void setPriorityName(String priorityName) {
        this.priorityName = priorityName;
    }
}
