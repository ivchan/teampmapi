package com.teammgr.teampm.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 25/1/2017.
 */
@Entity
@Table(name = "pm_project_milestone")
public class ProjectMilestone extends BaseEntity implements Serializable {
    @Id
    @Column(name = "milestone_key")
    private UUID milestoneKey;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "project_key", foreignKey = @ForeignKey(name = "fk_milestone_project"))
    private Project project;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "member_key", foreignKey = @ForeignKey(name = "fk_milestone_member"))
    private Member member;

    @Column(name = "milestone_name", length = 100, nullable = false)
    private String milestoneName;

    @Column(name = "start_date", nullable = true)
    private Date startDate;

    @Column(name = "end_date", nullable = true)
    private Date endDate;

    @Column(name = "description", length = 200)
    private String description;

    public UUID getMilestoneKey() {
        return milestoneKey;
    }

    public void setMilestoneKey(UUID milestoneKey) {
        this.milestoneKey = milestoneKey;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getMilestoneName() {
        return milestoneName;
    }

    public void setMilestoneName(String milestoneName) {
        this.milestoneName = milestoneName;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}