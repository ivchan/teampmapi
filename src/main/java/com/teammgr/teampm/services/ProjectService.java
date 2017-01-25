package com.teammgr.teampm.services;

import com.teammgr.teampm.entities.Project;
import com.teammgr.teampm.entities.TaskPriority;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 25/1/2017.
 */
public interface ProjectService {
    List<Project> listProject(UUID memberKey);
    Project addProject(Project project);
    Project updateProject(Project project);
    Project getProject(UUID memberKey, UUID projectKey);

    List<TaskPriority> listTaskPriority();
    TaskPriority addTaskPriority(TaskPriority priority);
}
