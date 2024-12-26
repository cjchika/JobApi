package com.cjchika.jobapp.company;

import com.cjchika.jobapp.job.Job;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();

    boolean updateCompany(Long id, Company com);

    void createCompany(Company company);

    Company getCompanyById(Long id);

    boolean deleteCompanyById(Long id);
}
