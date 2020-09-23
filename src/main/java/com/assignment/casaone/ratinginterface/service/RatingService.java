package com.assignment.casaone.ratinginterface.service;

import com.assignment.casaone.ratinginterface.dao.RatingsDAO;
import com.assignment.casaone.ratinginterface.model.SaveRatingsRequest;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RatingService {

    public List<RatingsDAO> getRatingsByProductId(ObjectId productId);

    public ResponseEntity<String> saveRatings(SaveRatingsRequest saveRatingsRequest);

    public ResponseEntity<String> updateRatings(RatingsDAO updateRequest);

    public ResponseEntity<String> deleteRating(ObjectId ratingId);

    /*
    public List<RatingModel> addBulkRatings(List<RatingModel> listOfRatings);

    public void deleteRating(String ratingId);
    */

}