package com.example.demo.repository;

import com.example.demo.model.Company;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class CompanyRepository {

    private ArrayList<Company> list = new ArrayList<>();
    public Company save(Company c) {
        Company company = new Company(
                c.getAddress(),
                c.getPhoneNr(),
                c.getCvr(),
                c.getOwners(),
                c.getProfitability()
        );
        list.add(company);

        return company;
    }

    public List<Company> getCompanies() {
        return list;
    }

    public Company getCompany(String cvr) {
        for (Company c : list) {
            if (c.getCvr().equals(cvr)) {
                return c;
            }
        }
        return null;
    }

    public Company updateCompany(Company company) {
        for (Company c : list) {
            if (c.getCvr().equals(company.getCvr())) {
                c.setAddress(company.getAddress());
                c.setPhoneNr(company.getPhoneNr());
                c.setOwners(company.getOwners());
                c.setProfitability(company.getProfitability());
                return c;
            }
        }
        return null;
    }

    public void deleteCompany(String cvr) {
        Iterator<Company> iterator = list.iterator();
        while (iterator.hasNext()) {
            Company company = iterator.next();
            if (company.getCvr().equals(cvr)) {
                iterator.remove();
                return;
            }
        }
    }
}
