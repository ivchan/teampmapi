package com.teammgr.teampm.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by ivanchan on 25/1/2017.
 */

@Entity
@Table(name = "pm_project_task_list")
public class ProjectTaskList extends BaseEntity implements Serializable {
    @Id
    @Column(name = "task_list_key")
    private UUID taskListKey;

    @Column(name = "task_list_name", length = 100, nullable = false)
    private String taskListName;

    @Column(name = "remarks", length = 255)
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "project_key", foreignKey = @ForeignKey(name = "fk_task_list_project"))
    private Project project;

    public UUID getTaskListKey() {
        return taskListKey;
    }

    public void setTaskListKey(UUID taskListKey) {
        this.taskListKey = taskListKey;
    }

    public String getTaskListName() {
        return taskListName;
    }

    public void setTaskListName(String taskListName) {
        this.taskListName = taskListName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
