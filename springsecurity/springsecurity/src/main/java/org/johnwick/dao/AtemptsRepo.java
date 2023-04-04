package org.johnwick.dao;

import org.johnwick.model.Attempts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface AtemptsRepo extends CrudRepository<Attempts,Integer>
{
   Optional<Attempts> findAttemptsByUserName(String username);
}
