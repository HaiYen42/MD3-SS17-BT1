package service;


import java.util.List;

import database.Database;
import product.Product;
import config.Config;

public class ProductServiceIPLM implements IGenericService<Product> {
    List<Product> productList = new Config<Product>().readFile(Database.PATH_PRODUCT);
    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
        new Config<Product>().writeFile(Database.PATH_PRODUCT,productList);
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId() == id) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId() == id) {
                productList.remove(i);
            }
        }
        new Config<Product>().writeFile(Database.PATH_PRODUCT,productList);
    }
}
