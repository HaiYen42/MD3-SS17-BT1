package view;

import config.Config;
import product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //KHởi tạo contructor.
//        List<Product> list = new Config<Product>().readFile("src/a.txt") ;
//        List<Product> listProduct = new ArrayList<>();
//        listProduct.add(new Product());
//        listProduct.add(new Product());
//        listProduct.add(new Product());
//        listProduct.add(new Product());
//        listProduct.add(new Product());
//        new Config<Product>().writeFile("src/a.txt");
        int choice;
        do {
            System.out.println(
                    "1. Nhập thông tin sản phẩm \n"+
                    "2. Hiển thị thông tin sản phẩm \n"+
                    "3. Tìm kiếm thông tin sản phẩm  \n"+
                    "4. Thoát");
            System.out.println("Vui lòng nhập lựa chọn");
            choice= input.nextInt();
            switch (choice){
                case 1:
                    new ProductManager().addProduct();
                    break;
                case 2:
                    new ProductManager().showTableProduct();
                    break;
                case 3:
                    new ProductManager().findProduct();
                    break;
                case 4:
                    System.out.println("Bạn đã thoát khỏi chương trình ");
                    System.exit(0);
            }
        }while (choice !=5);
    }
}