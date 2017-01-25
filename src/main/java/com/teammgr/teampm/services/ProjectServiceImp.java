package com.teammgr.teampm.services;

import com.teammgr.teampm.entities.Project;
import com.teammgr.teampm.entities.TaskPriority;
import com.teammgr.teampm.repositories.ProjectRepository;
import com.teammgr.teampm.repositories.TaskPriorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 25/1/2017.
 */
@Service
public class ProjectServiceImp implements ProjectService {
    private TaskPriorityRepository taskPriorityRepo;
    private ProjectRepository projectRepo;

    @Autowired
    public ProjectServiceImp(
            ProjectRepository projectRepository,
            TaskPriorityRepository taskPriorityRepository) {
        this.projectRepo = projectRepository;
        this.taskPriorityRepo = taskPriorityRepository;
    }

    @Override
    public List<Project> listProject(UUID memberKey) {
        return this.projectRepo.listProject(memberKey);
    }

    @Override
    public Project addProject(Project project) {
        return this.projectRepo.save(project);
    }

    @Override
    public Project updateProject(Project project) {
        return this.projectRepo.save(project);
    }

    @Override
    public Project getProject(UUID memberKey, UUID projectKey) {
        return this.projectRepo.getProject(memberKey, projectKey);
    }

    @Override
    public List<TaskPriority> listTaskPriority() {
        return this.taskPriorityRepo.findAll();
    }

    @Override
    public TaskPriority addTaskPriority(TaskPriority priority) {
        return this.taskPriorityRepo.save(priority);
    }
}
