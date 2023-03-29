package view;

import config.Config;
import controller.Controller;
import product.Product;

import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static Controller productController = new Controller();
    List<Product> listProduct = productController.showListProduct();
    Scanner input= new Scanner(System.in);
    public void showTableProduct(){
        System.out.println("***********PRODUCT MANAGERMENT************");
        System.out.println("=======ID=====NAME=====BRAND======PRICE=====OTHER DETAIL====");
        System.out.println("productsize "+ listProduct.size());
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(" "+listProduct.get(i).getProductId()+ " "+ listProduct.get(i).getProductName()
                    +" "+ listProduct.get(i).getBrand()+ " "+ listProduct.get(i).getPrice()+ " "+ listProduct.get(i).getOtherDetail()+ " " );
        }
        System.out.println("Enter quit to come back to Menu ");
        String backMenu = Config.scanner().nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }
    }
    public void addProduct(){

        int productId = 0;
        if (listProduct.size()==0) {
            productId=1;
        }else{
            productId=listProduct.get(listProduct.size()-1).getProductId()+1;
        }
        System.out.println("Enter product.Product Name ");
        String productName= input.nextLine();
        System.out.println("Enter product.Product Brand ");
        String Brand= input.nextLine();
        System.out.println("Enter product.Product Price");
        float price = Float.parseFloat(input.nextLine());
        System.out.println("Enter Other Detail ");
        String otherDetail = input.nextLine();
        productController.createProduct(new Product(productId, productName, Brand, price, otherDetail));
    }
    public void findProduct(){
        System.out.println("Nhập Id sản phẩm cần tìm");
        int id= Integer.parseInt(input.nextLine());
        System.out.println(productController.findProductById(id));
    }
}
