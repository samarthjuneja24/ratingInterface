package com.assignment.casaone.ratinginterface.model;

public class RatingModel {

    private String ratingId;

    public RatingModel(String ratingId) {
        this.ratingId = ratingId;
    }

    public RatingModel() {
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    @Override
    public String toString() {
        return "RatingModel{" +
                "ratingId='" + ratingId + '\'' +
                '}';
    }

    //I'm only adding one field as for now. Any more relevant fields can be added in this POJO as the fields remain extracted from the interface via POJO
}
