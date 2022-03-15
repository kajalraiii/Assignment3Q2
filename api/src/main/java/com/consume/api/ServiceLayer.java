package com.consume.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ServiceLayer {


    private WebClient webClient;
    private ApiRepo repo;
    @Autowired
    public ServiceLayer(WebClient webClient,ApiRepo repo){
        super();
        this.webClient=webClient;
        this.repo=repo;
    }
    public  Mono<Output> callApi(){


        return webClient
                .get()
                .uri("/api/v1/employee/1")
                .retrieve()
                .bodyToMono(Output.class)
                .flatMap(output->repo.save(output.getData()).then(Mono.just(output)));
    }
}

