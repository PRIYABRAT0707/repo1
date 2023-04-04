package org.bolton.dao;

import org.bolton.model.Registration;
import org.springframework.data.repository.CrudRepository;

public interface Registrationdao extends CrudRepository<Registration,Integer> {
}
