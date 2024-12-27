package com.cjchika.jobapp.review.impl;

import com.cjchika.jobapp.review.Review;
import com.cjchika.jobapp.review.ReviewRepository;
import com.cjchika.jobapp.review.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepo;

    @Override
    public List<Review> getAllReviews(Long companyId) {
        return reviewRepo.findByCompanyId(companyId);
    }
}
