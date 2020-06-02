package com.rohit.shoppingapp;

import com.rohit.shoppingapp.entity.VegetablePO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VegetableRepository extends JpaRepository<VegetablePO, Integer> {
    VegetablePO findByName(String name);
}
