package com.example.springcatmongo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SpringCatMongoApplicationTests {

    @Autowired
    private CatRepository repository;

    @Test
    void contextLoads() {
    }

    @Test
    public void process() {
        repository.deleteAll();

        repository.save(new Cat("1","Lucy", "orange", "Montreal"));
        repository.save(new Cat("2", "Amy", "darkgrey", "Montreal"));
        repository.save(new Cat("3", "Walter", "lightgrey", "New Mexico"));
        repository.save(new Cat("4", "Defino", "orange", "New Mexico"));

        log.info("All cats are:");
        for (Cat cat: repository.findAll()) {
            log.info("Car info: "+cat);
        }

        log.info("Cats in Montreal:");
        for (Cat cat: repository.findByCityName("Montreal")) {
            log.info("Car info: "+cat);
        }
        log.info("Cats in New Mexico:");
        for (Cat cat: repository.findByCityName("New Mexico")) {
            log.info("Car info: "+cat);
        }
    }

}
