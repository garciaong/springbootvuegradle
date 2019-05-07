package com.garcia.springbootvue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/** To direct Spring MVC to create RESTful endpoints at /post **/
@RepositoryRestResource(collectionResourceRel = "post", path = "post")
public interface PostRepository extends JpaRepository<Post,Integer>{

}
