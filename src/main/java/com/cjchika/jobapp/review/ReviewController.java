package com.cjchika.jobapp.review;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies/{companyId}")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("reviews")
    public ResponseEntity<List<Review>> getAllCompanyReviews(@PathVariable Long companyId){
        return new ResponseEntity<>(reviewService.getAllReviews(companyId), HttpStatus.OK);
    }

    @PostMapping("reviews")
    public ResponseEntity<String> addReview(@PathVariable Long companyId, @RequestBody Review review){
       boolean isReviewSaved =  reviewService.addReview(companyId, review);

       if(isReviewSaved){
           return new ResponseEntity<>("Review Added Successfully!", HttpStatus.CREATED);
       } else{
           return new ResponseEntity<>("Review not saved!", HttpStatus.BAD_REQUEST);
       }
    }

    @GetMapping("/reviews/{reviewId}")
    public ResponseEntity<Review> getReview(@PathVariable Long companyId, @PathVariable Long reviewId){
        Review review = reviewService.getReview(companyId, reviewId);
        return new ResponseEntity<>(review, HttpStatus.OK);
    }
}
