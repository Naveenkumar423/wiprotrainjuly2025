package com.wipro.letsgo.controller;

import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.service.VehicleMovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/move")
public class VehicleMovementController {

    @Autowired
    private VehicleMovementService service;

    // POST - Save vehicle movement
    @PostMapping
    public VehicleMovement moveVehicle(@RequestBody VehicleMovement movement) {
        return service.saveMovement(movement);
    }

    // GET - Retrieve all movements
    @GetMapping
    public List<VehicleMovement> getAllMovements() {
        return service.getAllMovements();
    }
}
