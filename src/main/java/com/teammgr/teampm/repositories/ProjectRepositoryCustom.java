package com.teammgr.teampm.repositories;

import com.teammgr.teampm.entities.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 25/1/2017.
 */
public interface ProjectRepositoryCustom {
    @Query("select p from Project as p where p.member = :member")
    List<Project> listProject(@Param("member")UUID member);

    @Query("select p from Project as p where p.member = :member and p.projectKey = :project")
    Project getProject(@Param("member")UUID member, @Param("project")UUID projectKey);
}
