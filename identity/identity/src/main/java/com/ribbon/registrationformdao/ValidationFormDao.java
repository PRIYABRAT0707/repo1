package com.ribbon.registrationformdao;

import com.ribbon.model.ErrorShow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ValidationFormDao extends CrudRepository<ErrorShow,Integer> {
}
