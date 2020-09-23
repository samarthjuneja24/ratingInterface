package com.assignment.casaone.ratinginterface.service.impl;

import com.assignment.casaone.ratinginterface.dao.RatingsDAO;
import com.assignment.casaone.ratinginterface.model.SaveRatingsRequest;
import com.assignment.casaone.ratinginterface.repository.RatingsRepository;
import com.assignment.casaone.ratinginterface.service.RatingService;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingsRepository ratingsRepository;

    private final Logger logger = LoggerFactory.getLogger(RatingServiceImpl.class);

    public List<RatingsDAO> getRatingsByProductId(ObjectId productId){

        logger.info("Fetching ratings for product id:" + productId.toString());
        List<RatingsDAO> ratingsDAOList = ratingsRepository.findAllByProductId(productId);
        if(ratingsDAOList == null){
            return new ArrayList<>();
        } else {
            return ratingsRepository.findAllByProductId(productId);
        }
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
        if(ratingsDAO == null){
            return ResponseEntity.badRequest().body("Entity does not exist");
        }
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
