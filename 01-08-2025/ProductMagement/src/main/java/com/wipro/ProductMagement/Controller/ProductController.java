package com.wipro.ProductMagement.Controller;

import com.wipro.productmanagement.entity.Product;
import com.wipro.ProductMagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
        return repository.findById(id)
                .map(product -> {
                    product.setProductName(updatedProduct.getProductName());
                    product.setProductMake(updatedProduct.getProductMake());
                    product.setProductPrice(updatedProduct.getProductPrice());
                    return repository.save(product);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        repository.deleteById(id);
    }
}
