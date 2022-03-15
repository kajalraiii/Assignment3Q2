package com.consume.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ApiController {

    private ServiceLayer serviceLayer;
    @Autowired
    public ApiController(ServiceLayer serviceLayer){
        this.serviceLayer=serviceLayer;
    }
    @GetMapping("/getapi")
    public Mono<Output> savegetApi(){
        return serviceLayer.callApi();

    }
}
