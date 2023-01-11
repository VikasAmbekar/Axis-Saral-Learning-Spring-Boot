package com.axis.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Project {
    @Id
    @Column(name = "Project_ID", nullable=false)
    private String projectId;
    @Column(name = "Project_Name", nullable=false)
    private String projectName;

    @Column(name = "Project_Manager_ID", nullable=false)
    public String managerId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Stakeholder stakeholder;

    public Project() {
    }

    public Project(String projectId, String projectName, String managerId, Stakeholder stakeholder) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.managerId = managerId;
        this.stakeholder = stakeholder;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public Stakeholder getStakeholder() {
        return stakeholder;
    }

    public void setStakeholder(Stakeholder stakeholder) {
        this.stakeholder = stakeholder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project project)) return false;
        return getProjectId().equals(project.getProjectId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProjectId());
    }
}

