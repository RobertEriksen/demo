package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository repository;

    public Company saveCompany(Company company) {
        return repository.save(company);
    }

    public List<Company> getCompanies() {
        return repository.getCompanies();
    }

    public Company getCompany(String cvr) {
        return repository.getCompany(cvr);
    }

    public Company updateCompany(Company company) {
        return repository.updateCompany(company);
    }

    public void deleteCompany(String cvr) {
        repository.deleteCompany(cvr);
    }
}
