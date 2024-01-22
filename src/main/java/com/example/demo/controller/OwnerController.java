package com.example.demo.controller;

import com.example.demo.model.Owner;
import com.example.demo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/owners")
public class OwnerController {

    @Autowired
    private OwnerService service;

    @PostMapping
    public Owner addOwner(@RequestBody Owner owner) {
        return service.saveOwner(owner);
    }

    @GetMapping
    public List<Owner> getOwners() {
        return service.getOwners();
    }

    @GetMapping("{cpr}")
    public Owner getOwner(@PathVariable String cpr) {
        return service.getOwner(cpr);
    }

    @PutMapping
    public Owner updateOwner(@RequestBody Owner owner) {
        return service.updateOwner(owner);
    }

    @DeleteMapping("{cpr}")
    public void deleteOwner(@PathVariable String cpr) {
        service.deleteOwner(cpr);
    }

}
