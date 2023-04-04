package com.ribbon.registrationformdao;

import com.ribbon.model.Human;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanDataDao extends CrudRepository<Human,Integer> {
}
