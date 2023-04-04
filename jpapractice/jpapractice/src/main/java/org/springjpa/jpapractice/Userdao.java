package org.springjpa.jpapractice;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Userdao extends CrudRepository<User,Integer> {
    public List<User>findByName(String name);
    List<User> findByCityAndName(String city,String name );
}
