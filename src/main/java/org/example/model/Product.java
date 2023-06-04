package org.example.model;

public class Product {
    private String productName;
    private double  productPrice;
    private String productID;
    private String productModel;

    public Product(String productName,double productPrice, String productID, String productModel) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productID = productID;
        this.productModel = productModel;
    }

    public String getProductName() {

        return productName;
    }

    public String getProductID()
    {
        return productID;
    }

    public double getProductPrice()
    {

        return productPrice;
    }

    public String getProductModel() {
        return productModel;
    }



    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", productID=" + productID +
                ", productPrice=" + productPrice +
                ", productModel='" + productModel + '\'' +
                '}';
    }

    public double getProductprice() {
        return productPrice;

    }
}


