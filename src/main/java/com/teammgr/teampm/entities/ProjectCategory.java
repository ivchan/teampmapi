package com.teammgr.teampm.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by ivanchan on 25/1/2017.
 */
@Entity
@Table(name = "pm_project_category")
public class ProjectCategory extends BaseEntity implements Serializable{
    @Id
    @Column(name = "category_key")
    private UUID projectKey;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "member_key", foreignKey = @ForeignKey(name = "fk_projectcategory_member"))
    private Member member;

    @Column(name = "category_name", length = 100, nullable = false)
    private String projectName;

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
}
