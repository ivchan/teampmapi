package com.teammgr.teampm.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by ivanchan on 25/1/2017.
 */

@MappedSuperclass
public class BaseEntity implements Serializable{
    @Version
    @JsonIgnore
    @Column(name = "last_updated_time")
    protected Date updatedTime;

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
