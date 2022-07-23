package com.example.azurespring.azurespringdemo;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ItemsRepository extends ReactiveCosmosRepository<Item, String> {
    Flux<Item> findByCategory(String category);
}
