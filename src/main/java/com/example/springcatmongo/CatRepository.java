package com.example.springcatmongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CatRepository extends MongoRepository<Cat, String> {
    public Cat findByName(String name);
    public List<Cat> findByCityName(String city);
}
