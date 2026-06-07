package com.example.spring_reactive_demo;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
    public Mono<Product> getProductById(Long id) {
        Product product = new Product(id, "Wireless Head Phone", 100.10, "Electornics");
        return Mono.just(product);
    }
}
