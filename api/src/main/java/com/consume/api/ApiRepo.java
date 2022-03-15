package com.consume.api;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRepo extends ReactiveMongoRepository<Employee,Integer> {

}
