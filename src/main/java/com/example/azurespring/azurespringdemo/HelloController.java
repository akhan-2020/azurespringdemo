package com.example.azurespring.azurespringdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.util.Assert;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RestController
public class HelloController {

    @Autowired
    private ItemsRepository repository;

    @RequestMapping("/")
    public String index() {
        final Mono<Item> optionalUserResult = repository.findById("1");
       
        System.out.println(optionalUserResult.block().getName());
        return "Greetings from Azure Spring Apps!";
    }

}
