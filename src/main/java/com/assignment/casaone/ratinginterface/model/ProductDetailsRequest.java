package com.assignment.casaone.ratinginterface.model;

public class ProductDetailsRequest {

    private String objectId;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public ProductDetailsRequest(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public String toString() {
        return "ProductDetailsRequest{" +
                "objectId='" + objectId + '\'' +
                '}';
    }
}
