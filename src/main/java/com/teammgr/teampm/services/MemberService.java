package com.teammgr.teampm.services;

import com.teammgr.teampm.entities.Member;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 25/1/2017.
 */
public interface MemberService {
    List<Member> listMembers();
    Member addMember(Member member);
    Member updateMember(UUID memberKey, Member member);
    Member getMember(UUID memberKey);
    void deleteMember(UUID memberKey);
}
