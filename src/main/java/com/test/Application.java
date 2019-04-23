package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Matt on 23.04.2019 at 18:32.
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    /*@Bean
    ApplicationRunner applicationRunner(InsertRepository insertRepository) {
        return args -> {
            insertRepository.save(new Insert("storm"));
            insertRepository.save(new Insert("rain"));
        };
***REMOVED***

}

@RestController
class TestController {

    private final InsertRepository insertRepository;

    @GetMapping("/")
    String test() {
        return "Test no. 2 ***REMOVED***ed!";
    }

    @GetMapping("/inserts")
    Iterable<Insert> inserts() {
        return insertRepository.findAll();
    }

    public TestController(InsertRepository insertRepository) {
        this.insertRepository = insertRepository;
    }
}

interface InsertRepository extends CrudRepository<Insert, Long> {
}

@Entity
class Insert {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String message;

    public Insert() {}

    public Insert(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}

