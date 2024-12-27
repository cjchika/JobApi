package com.cjchika.jobapp.review.impl;

import com.cjchika.jobapp.review.Review;
import com.cjchika.jobapp.review.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Override
    public List<Review> findAll() {
        return List.of();
    }

    @Override
    public void createReview(Review review) {

    }

    @Override
    public Review getReviewById(Long id) {
        return null;
    }

    @Override
    public boolean deleteReviewById(Long id) {
        return false;
    }

    @Override
    public boolean updateReview(Long id, Review updatedReview) {
        return false;
    }
}
