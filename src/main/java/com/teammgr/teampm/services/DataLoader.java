package com.teammgr.teampm.services;

import com.teammgr.teampm.entities.Member;
import com.teammgr.teampm.entities.TaskPriority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 25/1/2017.
 */

@Service
public class DataLoader implements ApplicationRunner {
    private MemberService memberService;
    private ProjectService projectService;

    @Autowired
    public DataLoader(MemberService memberService, ProjectService projectService) {
        this.memberService = memberService;
        this.projectService = projectService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Member mDev = new Member();
        mDev.setMemberKey(UUID.fromString("fe317707-a7f0-4b3d-bdbb-a3a809ba5995"));
        mDev.setMemberCode("DEV");
        mDev.setMemberName("Developer");
        mDev.setJoinDate(new Date(20170101));
        mDev.setRemarks("Developer");
        mDev.setRegisterEmail("29january@gmail.com");
        mDev.setRegisterPwd("88888");
        this.memberService.addMember(mDev);

        TaskPriority pLow = new TaskPriority(1, "Low");
        TaskPriority pMed = new TaskPriority(2, "Med");
        TaskPriority pHigh = new TaskPriority(3, "High");
        TaskPriority pUrgent = new TaskPriority(4, "Urgent");

        this.projectService.addTaskPriority(pLow);
        this.projectService.addTaskPriority(pMed);
        this.projectService.addTaskPriority(pHigh);
        this.projectService.addTaskPriority(pUrgent);
    }
}
