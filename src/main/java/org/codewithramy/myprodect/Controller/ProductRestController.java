package org.codewithramy.myprodect.Controller;

import org.codewithramy.myprodect.entites.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.codewithramy.myprodect.repos.Prodectrepo;

import java.util.List;

@RestController
public class ProductRestController {
    @Autowired
    private Prodectrepo repository;

    @GetMapping("/products/")
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id") int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/products/")
    public Product addProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @PutMapping("/products/")
    public Product updateProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
