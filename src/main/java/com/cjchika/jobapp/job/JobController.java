package com.cjchika.jobapp.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> findAll(){
        List<Job> jobs = jobService.findAll();
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }

    @PostMapping("/jobs")
    public ResponseEntity<Job> createJob(@RequestBody Job job){
        jobService.createJob(job);
        return new ResponseEntity<>(job, HttpStatus.CREATED);
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> createJob(@PathVariable Long id){
        Job job = jobService.getJobById(id);

        if(job != null)
            return new ResponseEntity<>(job, HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable Long id){
        boolean isDeleted = jobService.deleteJobById(id);

        if(isDeleted)
            return new ResponseEntity<>("Job deleted successfully!", HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/jobs/{id}")
    public ResponseEntity<String> updateJob(@PathVariable Long id, @RequestBody Job job){
        boolean updated = jobService.updateJob(id, job);

        if(updated)
            return new ResponseEntity<>("Job updated successfully!", HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
