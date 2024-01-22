package com.example.demo.service;

import com.example.demo.model.Owner;
import com.example.demo.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    @Autowired
    OwnerRepository repository;

    public Owner saveOwner(Owner owner) {
        return repository.save(owner);
    }

    public List<Owner> getOwners() {
        return repository.getAllOwners();
    }

    public Owner getOwner(String cpr){
        return repository.getOwner(cpr);
    }

    public Owner updateOwner(Owner owner) {
        return repository.updateOwner(owner);
    }

    public void deleteOwner(String cpr) {
        repository.deleteOwner(cpr);
    }
}
