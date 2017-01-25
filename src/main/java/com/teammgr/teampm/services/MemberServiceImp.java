package com.teammgr.teampm.services;

import com.teammgr.teampm.entities.Member;
import com.teammgr.teampm.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 25/1/2017.
 */

@Service
public class MemberServiceImp implements MemberService {
    private MemberRepository memberRepo;

    @Autowired
    public MemberServiceImp(MemberRepository memberRepository) {
        this.memberRepo = memberRepository;
    }

    @Override
    public List<Member> listMembers() {
        return this.memberRepo.findAll();
    }

    @Override
    public Member addMember(Member member) {
        return this.memberRepo.save(member);
    }

    @Override
    public Member updateMember(UUID memberKey, Member member) {
        return this.memberRepo.save(member);
    }

    @Override
    public Member getMember(UUID memberKey) {
        return this.memberRepo.findOne(memberKey);
    }

    @Override
    public void deleteMember(UUID memberKey) {
        this.memberRepo.delete(memberKey);
    }
}
