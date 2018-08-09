package com.softnec.liftnec.controller;

import com.softnec.liftnec.model.domain.Elevator;
import com.softnec.liftnec.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@ApiIgnore
public class HealthController
{
    @Autowired
    ProductRepository repo;

    @RequestMapping("/")
    public String home() {

        return "SoftNec's first running micro-service docker container";
    }
    @RequestMapping("/healthCheck")
    public String healthCheck() {
        Elevator em = repo.save(new Elevator());
        repo.delete(em);
        return "OK";
    }

    @RequestMapping("/getExampleModel")
    public Iterable<Elevator> getExampleModel() {
        Elevator em = repo.save(new Elevator());
        return repo.findAll();
    }
}
