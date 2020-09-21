package com.assignment.casaone.ratinginterface.model;

public class ProductModel {

    private String productId;

    public ProductModel(String productId) {
        this.productId = productId;
    }

    public ProductModel() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "productId='" + productId + '\'' +
                '}';
    }

    //I'm only adding one field as for now. Any more relevant fields can be added in this POJO as the fields remain extracted from the interface via POJO

}
