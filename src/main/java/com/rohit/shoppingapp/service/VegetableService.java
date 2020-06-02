package com.rohit.shoppingapp.service;

import com.rohit.shoppingapp.entity.VegetablePO;

import java.util.List;

public interface VegetableService {
    List<VegetablePO> getAllVegetables();

    boolean addVegetable(VegetablePO vegetable);

    boolean updateVegetable(VegetablePO vegetable);

    boolean updateVegetablePrice(VegetablePO vegetable);

    boolean updateVegetableDescription(VegetablePO vegetable);

    VegetablePO getVegetable(String vegetableName);
}
