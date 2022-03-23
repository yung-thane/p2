package com.revature.demo2;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Integer>{
    
}
