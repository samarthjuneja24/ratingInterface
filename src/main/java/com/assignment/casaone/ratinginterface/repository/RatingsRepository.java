package com.assignment.casaone.ratinginterface.repository;

import com.assignment.casaone.ratinginterface.dao.RatingsDAO;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingsRepository extends MongoRepository<RatingsDAO, Long> {

    public RatingsDAO findByProductId(ObjectId productId);

    public List<RatingsDAO> findAllByProductId(ObjectId ratingId);

    public RatingsDAO findById(ObjectId ratingId);
}
