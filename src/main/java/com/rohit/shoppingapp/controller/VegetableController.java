package com.rohit.shoppingapp.controller;

import com.rohit.shoppingapp.entity.VegetablePO;
import com.rohit.shoppingapp.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vegetables")
public class VegetableController {

    @Autowired
    private VegetableService vegetableService;

    @GetMapping("/getAll")
    public ResponseEntity<List<VegetablePO>> getAllVegetables() {
        return ResponseEntity.ok(vegetableService.getAllVegetables());
    }

    @GetMapping("/get/{vegetable}")
    public ResponseEntity<VegetablePO> getVegetable(@PathVariable String vegetableName) {
        return ResponseEntity.ok(vegetableService.getVegetable(vegetableName));
    }

    @PostMapping("/create")
    public ResponseEntity<Boolean> addVegetable(@RequestBody VegetablePO vegetable) {
        return ResponseEntity.ok(vegetableService.addVegetable(vegetable));
    }

    @PutMapping("/update")
    public ResponseEntity<Boolean> updateVegetable(@RequestBody VegetablePO vegetable) {
        return ResponseEntity.ok(vegetableService.updateVegetable(vegetable));
    }

    @PutMapping("updatePrice")
    public ResponseEntity<Boolean> updateVegetablePrice(@RequestBody VegetablePO vegetable) {
        return ResponseEntity.ok(vegetableService.updateVegetablePrice(vegetable));
    }

    @PutMapping("updateDescription")
    public ResponseEntity<Boolean> updateVegetableDescription(@RequestBody VegetablePO vegetable) {
        return ResponseEntity.ok(vegetableService.updateVegetableDescription(vegetable));
    }
}
