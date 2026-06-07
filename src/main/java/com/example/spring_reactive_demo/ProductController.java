package com.example.spring_reactive_demo;
import org.springframework.web.bind.annotation.*;
import com.example.spring_reactive_demo.Product;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("http://localhost:5173/")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Mono<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}
