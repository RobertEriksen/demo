package com.example.demo.controller;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/companies")
public class CompanyController {

    @Autowired
    CompanyService service;

    @PostMapping
    public Company addCompany(@RequestBody Company company) {
        return service.saveCompany(company);
    }

    @GetMapping
    public List<Company> getCompanies() {
        return service.getCompanies();
    }

    @GetMapping("{cvr}")
    public Company getCompany(@PathVariable String cvr) {
        return service.getCompany(cvr);
    }

    @PutMapping
    public Company updateCompany(@RequestBody Company company) {
        return service.updateCompany(company);
    }

    @DeleteMapping("{cvr}")
    public void deleteCompany(@PathVariable String cvr) {
        service.deleteCompany(cvr);
    }

}
