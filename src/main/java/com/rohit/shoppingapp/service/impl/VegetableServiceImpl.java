package com.rohit.shoppingapp.service.impl;

import com.rohit.shoppingapp.VegetableRepository;
import com.rohit.shoppingapp.entity.VegetablePO;
import com.rohit.shoppingapp.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableServiceImpl implements VegetableService {

    @Autowired
    private VegetableRepository vegetableRepository;

    @Override
    public List<VegetablePO> getAllVegetables() {
        return vegetableRepository.findAll();
    }

    @Override
    public boolean addVegetable(VegetablePO vegetable) {
        vegetableRepository.save(vegetable);
        return true;
    }

    @Override
    public boolean updateVegetable(VegetablePO vegetable) {
        VegetablePO vegetablePO = vegetableRepository.findByName(vegetable.getName());
        vegetablePO.setDescription(vegetable.getDescription());
        vegetablePO.setPrice(vegetable.getPrice());
        vegetableRepository.save(vegetablePO);
        return true;
    }

    @Override
    public boolean updateVegetablePrice(VegetablePO vegetable) {
        VegetablePO vegetablePO = vegetableRepository.findByName(vegetable.getName());
        vegetablePO.setPrice(vegetable.getPrice());
        vegetableRepository.save(vegetablePO);
        return true;
    }

    @Override
    public boolean updateVegetableDescription(VegetablePO vegetable) {
        VegetablePO vegetablePO = vegetableRepository.findByName(vegetable.getName());
        vegetablePO.setDescription(vegetable.getDescription());
        vegetableRepository.save(vegetablePO);
        return true;
    }

    @Override
    public VegetablePO getVegetable(String vegetableName) {
        return vegetableRepository.findByName(vegetableName);
    }
}
