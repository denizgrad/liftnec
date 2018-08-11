package com.softnec.liftnec.controller;

import com.softnec.liftnec.model.domain.product.Asansor;
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
        Asansor em = repo.save(new Asansor());
        repo.delete(em);
        return "OK";
    }

    @RequestMapping("/getExampleModel")
    public Iterable<Asansor> getExampleModel() {
        Asansor em = repo.save(new Asansor());
        return repo.findAll();
    }
}
