package com.teammgr.teampm.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 25/1/2017.
 */
@Entity
@Table(name = "pm_project")
public class Project extends BaseEntity implements Serializable{
    @Id
    @Column(name = "project_key")
    private UUID projectKey;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(
            name = "member_key",
            foreignKey = @ForeignKey(name = "fk_project_member"))
    private Member member;

    @Column(name = "project_name", length = 100, nullable = false)
    private String projectName;

    @Column(name = "project_code", length = 10, nullable = false)
    private String projectCode;

    @Column(name = "description", length = 200)
    private String description;

    @Column(name = "start_date", nullable = true)
    private Date startDate;

    @Column(name = "end_date", nullable = true)
    private Date endDate;

    @ManyToMany
    @JoinTable(name = "pm_project_team_members",
            joinColumns = @JoinColumn(
                    name = "project_key",
                    referencedColumnName = "project_key",
                    foreignKey = @ForeignKey(name = "fk_project_teammember_project")),
            inverseJoinColumns = @JoinColumn(
                    name = "user_key",
                    referencedColumnName = "user_key",
                    foreignKey = @ForeignKey(name = "fk_project_teammember_user"))
    )
    private List<User> teamMembers;

    public UUID getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(UUID projectKey) {
        this.projectKey = projectKey;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<User> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<User> teamMembers) {
        this.teamMembers = teamMembers;
    }
}
