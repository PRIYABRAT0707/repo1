package org.johnwick.service;

import org.johnwick.dao.MemberRepo;
import org.johnwick.model.Member;
import org.johnwick.serviceinterface1.MemberServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MemberServiceImplementation implements MemberServiceInterface {
    @Autowired
    private org.johnwick.dao.MemberRepo MemberRepo;

    public Member saveMember(Member mem){
        return this.MemberRepo.save(mem);

    }
    public Optional<Member> getMember(String username){
       return this.MemberRepo.findMemberByUserName(username);
    }
}
