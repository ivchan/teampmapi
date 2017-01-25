package com.teammgr.teampm.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 20/1/2017.
 */

@Entity
@Table(name = "pm_user")
public class User extends BaseEntity implements Serializable{
    @Id
    @Column(name = "user_key")
    private UUID userKey;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "member_key", foreignKey = @ForeignKey(name = "fk_user_member"))
    private Member member;

    @Column(name = "user_name", length = 100, nullable = false)
    private String userName;

    @Column(name = "join_date")
    private Date joinDate;

    @Column(name = "login_id", length = 20, nullable = false)
    private String loginID;

    public UUID getUserKey() {
        return userKey;
    }

    public void setUserKey(UUID userKey) {
        this.userKey = userKey;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
