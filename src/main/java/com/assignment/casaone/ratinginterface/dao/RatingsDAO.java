package com.assignment.casaone.ratinginterface.dao;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ratings")
public class RatingsDAO {

    @Id
    private ObjectId id;

    private ObjectId productId;

    private int rating;

    private String ratingText;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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
        return "RatingsDAO{" +
                "id=" + id +
                ", productId=" + productId +
                ", rating=" + rating +
                ", ratingText='" + ratingText + '\'' +
                '}';
    }
}
