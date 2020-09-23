package com.assignment.casaone.ratinginterface.service.impl;

import com.assignment.casaone.ratinginterface.dao.RatingsDAO;
import com.assignment.casaone.ratinginterface.model.SaveRatingsRequest;
import com.assignment.casaone.ratinginterface.repository.RatingsRepository;
import com.assignment.casaone.ratinginterface.service.RatingService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingsRepository ratingsRepository;

    public List<RatingsDAO> getRatingsByProductId(ObjectId productId){

        return ratingsRepository.findAllByProductId(productId);
        //return ratingsRepository.findByProductId(productId);
    }

    public RatingsDAO getRating(ObjectId ratingId){

        return ratingsRepository.findById(ratingId);
    }

    public ResponseEntity<String> saveRatings(SaveRatingsRequest saveRatingsRequest){

        RatingsDAO ratingsDAO = new RatingsDAO();
        ratingsDAO.setProductId(saveRatingsRequest.getProductId());
        ratingsDAO.setRating(saveRatingsRequest.getRating());
        ratingsDAO.setRatingText(saveRatingsRequest.getRatingText());
        ratingsRepository.save(ratingsDAO);

        return ResponseEntity.ok("Ratings saved successfully");
    }

    public ResponseEntity<String> updateRatings(RatingsDAO updateRequest){

        RatingsDAO ratingsDAO = ratingsRepository.findById(updateRequest.getId());
        ratingsDAO.setRatingText(updateRequest.getRatingText());
        ratingsDAO.setRating(updateRequest.getRating());
        ratingsRepository.save(ratingsDAO);

        return ResponseEntity.ok("Ratings updated successfully with rating id:" + updateRequest.getId().toString());
    }

    public ResponseEntity<String> deleteRating(ObjectId ratingId){

        ratingsRepository.deleteById(ratingId);
        return ResponseEntity.ok("Rating deleted successfully with id:" + ratingId.toString());
    }
}
