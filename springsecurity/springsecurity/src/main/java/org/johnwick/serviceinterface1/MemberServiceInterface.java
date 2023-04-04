package org.johnwick.serviceinterface1;

import org.johnwick.model.Member;

import java.util.Optional;

public interface MemberServiceInterface {

    public Member saveMember(Member mem);
    public Optional<Member> getMember(String username);
}
