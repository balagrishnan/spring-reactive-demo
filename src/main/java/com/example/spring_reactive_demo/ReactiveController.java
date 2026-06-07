package com.example.spring_reactive_demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

@RestController
@CrossOrigin("http://localhost:5173/")
public class ReactiveController {
    private final ReactiveService reactiveService;

    public ReactiveController(ReactiveService reactiveService){
        this.reactiveService = reactiveService;
    }

    @GetMapping("/messages")
    public Flux<String> getMessage(){
        return reactiveService.getMessage();
    }
}
