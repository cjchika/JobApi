package com.cjchika.jobapp.review;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/companies/{companyId}")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

}
