package org.johnwick.dao;

import org.johnwick.model.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface MemberRepo extends CrudRepository<Member,Integer> {
    public Optional<Member> findMemberByUserName(String username);
}
