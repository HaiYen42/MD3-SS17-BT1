package controller;

import product.Product;
import service.ProductServiceIPLM;

import java.util.List;

public class Controller {
    ProductServiceIPLM productService = new ProductServiceIPLM();
    public List<Product> showListProduct(){
        return productService.findAll();
    }
    public void createProduct(Product product){
        productService.save(product);
    }
    public void deleteProduct(int id){
        productService.deleteById(id);
    }
    public Product findProductById(int id){
        return productService.findById(id);
    }
}
