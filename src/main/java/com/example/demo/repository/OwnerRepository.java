package com.example.demo.repository;

import com.example.demo.model.Owner;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class OwnerRepository {

    private List<Owner> list = new ArrayList<>();
    public Owner save(Owner o) {
        Owner owner = new Owner(
                o.getName(),
                o.getAddress(),
                o.getCpr()
        );
        list.add(owner);
        return owner;
    }

    public List<Owner> getAllOwners() {
        return list;
    }

    public Owner getOwner(String cpr) {
        for (Owner o : list) {
            if (o.getCpr().equals(cpr)) {
                return o;
            }
        }
        return null;
    }

    public Owner updateOwner(Owner owner) {
        for (Owner o : list) {
            if (o.getCpr().equals(owner.getCpr())) {
                o.setName(owner.getName());
                o.setAddress(owner.getAddress());
                return o;
            }
        }
        return null;
    }

    public void deleteOwner(String cpr) {
        Iterator<Owner> iterator = list.iterator();
        while (iterator.hasNext()) {
            Owner owner = iterator.next();
            if (owner.getCpr().equals(cpr)) {
                iterator.remove();
                return;
            }
        }
    }

}
