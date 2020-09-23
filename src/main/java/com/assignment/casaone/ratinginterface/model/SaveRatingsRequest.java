package com.assignment.casaone.ratinginterface.model;

import org.bson.types.ObjectId;

public class SaveRatingsRequest {

    private ObjectId productId;

    private int rating;

    private String ratingText;

    public SaveRatingsRequest(ObjectId productId, int rating, String ratingText) {
        this.productId = productId;
        this.rating = rating;
        this.ratingText = ratingText;
    }

    public SaveRatingsRequest() {
    }

    public ObjectId getProductId() {
        return productId;
    }

    public void setProductId(ObjectId productId) {
        this.productId = productId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRatingText() {
        return ratingText;
    }

    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    @Override
    public String toString() {
        return "SaveRatingsRequest{" +
                "productId=" + productId +
                ", rating=" + rating +
                ", ratingText='" + ratingText + '\'' +
                '}';
    }
}
