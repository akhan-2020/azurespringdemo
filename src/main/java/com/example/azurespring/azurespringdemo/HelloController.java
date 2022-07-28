package com.example.azurespring.azurespringdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.MediaType;
import org.springframework.util.Assert;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RestController
public class HelloController {

    @Autowired
    private ItemsRepository repository;

    @PostMapping("/item")
    Mono<Item> newEmployee(@RequestBody Item item) {
        return repository.save(item);
    }

    @GetMapping(path = "/item/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    Mono<Item> one(@PathVariable Long id) {
        return repository.findById(id.toString());    
    }

    @RequestMapping("/")
    public String index() {
        final Mono<Item> optionalUserResult = repository.findById("1");
       
        System.out.println(optionalUserResult.block().getName());
        return "Greetings from Azure Spring Apps!";
    }

}
