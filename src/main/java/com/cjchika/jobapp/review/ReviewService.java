package com.cjchika.jobapp.review;

import java.util.List;

public interface ReviewService {
    List<Review> findAll();

    void createReview(Review review);

    Review getReviewById(Long id);

    boolean deleteReviewById(Long id);

    boolean updateReview(Long id, Review updatedReview);
}
