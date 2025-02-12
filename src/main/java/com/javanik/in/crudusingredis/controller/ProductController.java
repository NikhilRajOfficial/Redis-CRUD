package com.javanik.in.crudusingredis.controller;


import com.javanik.in.crudusingredis.entity.Product;
import com.javanik.in.crudusingredis.repo.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

      @Autowired
      private ProductDao productDao;

       @PostMapping
       public Product saveProduct(@RequestBody  Product product)
       {
           return productDao.saveProduct(product);
       }

       @GetMapping("/allProduct")
      public List<Product> getAllProduct()
       {
           return productDao.findAll();
       }

       @GetMapping("/allProduct/{id}")
       public Product getProductById(@PathVariable int id)
       {
           return productDao.findProductById(id);
       }

        @DeleteMapping("/allProduct/{id}")
        public String deleteProductById(@PathVariable int id)
        {
              productDao.deleteProductById(id);
              return "Deleted Successfully";
        }

}
