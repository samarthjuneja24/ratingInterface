package com.assignment.casaone.ratinginterface.controller;

import com.assignment.casaone.ratinginterface.dao.RatingsDAO;
import com.assignment.casaone.ratinginterface.model.SaveRatingsRequest;
import com.assignment.casaone.ratinginterface.service.RatingService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class RatingInterfaceController {

    @Autowired
    private RatingService ratingService;

    @GetMapping(value = "/productDetails/{productId}")
    public List<RatingsDAO> productDetails(@PathVariable String productId){
        return ratingService.getRatingsByProductId(new ObjectId(productId));
    }

    @PostMapping(value = "/saveRating")
    public ResponseEntity<String> saveRating(@RequestBody SaveRatingsRequest saveRatingsRequest){
        return ratingService.saveRatings(saveRatingsRequest);
    }

    @PutMapping(value = "/updateRating")
    public ResponseEntity<String> updateRating(@RequestBody RatingsDAO ratingsDAO){
        return ratingService.updateRatings(ratingsDAO);
    }

    @DeleteMapping(value = "/deleteRating/{ratingId}")
    public ResponseEntity<String> deleteRating(@PathVariable String ratingId){
        return ratingService.deleteRating(new ObjectId(ratingId));
    }
}