package com.hodv.springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hodv.springbootmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
