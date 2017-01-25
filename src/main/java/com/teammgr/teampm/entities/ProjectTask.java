package com.teammgr.teampm.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 25/1/2017.
 */

@Entity
@Table(name = "pm_project_task")
public class ProjectTask extends BaseEntity implements Serializable {
    @Id
    @Column(name = "task_key")
    private UUID taskKey;

    @ManyToOne
    @JoinColumn(name = "project_key")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "task_list_key")
    private ProjectTaskList taskList;

    @Column(name = "description", length = 100, nullable = false)
    private String taskDesc;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "create_date")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "create_by")
    private User createdBy;

    @Column(name = "last_modify_date")
    private Date lastModifyDate;

    @ManyToOne
    @JoinColumn(name = "last_modify_by")
    private User lastModifyBy;

    @Column(name = "delete_date")
    private Date deleteDate;

    @ManyToOne
    @JoinColumn(name = "delete_by")
    private User deleteBy;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedUser;

    private Date assignDate;

    @Column(name = "remarks", length = 255)
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "task_priority")
    private TaskPriority taskPriority;

    @Column(name = "completion_progress")
    private int completionProgress;

    @Column(name = "task_dependent")
    private UUID taskDependent;

    public UUID getTaskKey() {
        return taskKey;
    }

    public void setTaskKey(UUID taskKey) {
        this.taskKey = taskKey;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public ProjectTaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(ProjectTaskList taskList) {
        this.taskList = taskList;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public int getCompletionProgress() {
        return completionProgress;
    }

    public void setCompletionProgress(int completionProgress) {
        this.completionProgress = completionProgress;
    }

    public UUID getTaskDependent() {
        return taskDependent;
    }

    public void setTaskDependent(UUID taskDependent) {
        this.taskDependent = taskDependent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public User getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(User lastModifyBy) {
        this.lastModifyBy = lastModifyBy;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    public User getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(User deleteBy) {
        this.deleteBy = deleteBy;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Date getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }
}
