package product;

import config.Config;
import database.Database;

import java.io.InputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Product implements Serializable {
    private int ProductId;
    private String ProductName;
    private String Brand;
    private float price;
    private String otherDetail;

    public Product() {
    }
    public Product(int productId, String productName, String brand, float price, String otherDetail) {
        ProductId = productId;
        ProductName = productName;
        Brand = brand;
        this.price = price;
        this.otherDetail = otherDetail;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getOtherDetail() {
        return otherDetail;
    }

    public void setOtherDetail(String otherDetail) {
        this.otherDetail = otherDetail;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductId=" + ProductId +
                ", ProductName='" + ProductName + '\'' +
                ", Brand='" + Brand + '\'' +
                ", price=" + price +
                ", otherDetail='" + otherDetail + '\'' +
                '}';
    }
}
