package com.cjchika.jobapp.review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId);
    boolean addReview(Long companyId,Review review);
    Review getReview(Long companyId, Long reviewId);
//    Review getReviewById(Long id);
    boolean deleteReviewById(Long companyId, Long reviewId);
    boolean updateReview(Long companyId, Long reviewId, Review updatedReview);
}
