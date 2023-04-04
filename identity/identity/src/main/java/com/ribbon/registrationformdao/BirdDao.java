package com.ribbon.registrationformdao;

import com.ribbon.model.Bird;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BirdDao extends CrudRepository<Bird,Integer> {
    @Modifying
    @Query("update Bird b set b.birdName=:birdName,b.countryWhereMostSeen=:countryWhereMostSeen where b.id=:id")
    public void update(@Param(value = "id") int id,@Param(value="birdName") String birdName,@Param("countryWhereMostSeen") String countryWhereMostSeen);


}
