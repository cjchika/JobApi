package com.cjchika.jobapp.job.impl;

import com.cjchika.jobapp.job.Job;
import com.cjchika.jobapp.job.JobRepository;
import com.cjchika.jobapp.job.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepo;

    @Override
    public List<Job> findAll() {
        return jobRepo.findAll();
    }

    @Override
    public void createJob(Job job) {
        jobRepo.save(job);
    }

    @Override
    public Job getJobById(Long id) {
        return jobRepo.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobById(Long id) {
         try {
             jobRepo.deleteById(id);
             return  true;
         } catch (Exception e){
             return false;
         }
    }

    @Override
    public boolean updateJob(Long id, Job updatedJob) {
        Optional<Job> jobOptional = jobRepo.findById(id);

        if(jobOptional.isPresent()){
            jobRepo.save(updatedJob);
            return true;
        }
        return false;
    }
}
