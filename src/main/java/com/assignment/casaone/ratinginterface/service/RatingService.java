package com.assignment.casaone.ratinginterface.service;

import com.assignment.casaone.ratinginterface.model.RatingModel;
import java.util.List;

public interface RatingService {

    public RatingModel getRatingsByProductId(String productId);

    public List<RatingModel> getRatingsByProductIds(List<String> listOfProductIds);

    public List<RatingModel> addBulkRatings(List<RatingModel> listOfRatings);

    public void addRating(RatingModel ratingModel);

    public void updateRating(String ratingId);

    public void deleteRating(String ratingId);

    public void deleteRatingByUser(String userId);

    public void deleteBulkRatings(List<String> listOfRatingIds);

}