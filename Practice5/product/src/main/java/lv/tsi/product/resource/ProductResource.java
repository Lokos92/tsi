package lv.tsi.product.resource;

import lombok.RequiredArgsConstructor;
import lv.tsi.product.model.Product;
import lv.tsi.product.service.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductResource {
    private final ProductRepository productRepository;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productRepository.findAll());
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        return productRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    /**
     * I don't know how to do this task without @PostMapping,
     * because when I try to insert my values into the table in the h2 database
     * it throws me error saying that my ProductCategory is Integer,
     * and I don't understand how I can fix this problem,
     * but in PostMan with PostMapping everything works just fine
     */
    @PostMapping("/product")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        var saveProduct = productRepository.save(product);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveProduct);
    }
}
