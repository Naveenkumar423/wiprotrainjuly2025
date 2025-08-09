package com.wipro.letsgo.service;

import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.repository.VehicleMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleMovementService {

    @Autowired
    private VehicleMovementRepository repository;

    public VehicleMovement saveMovement(VehicleMovement movement) {
        return repository.save(movement);
    }

    public List<VehicleMovement> getAllMovements() {
        return repository.findAll();
    }
}
