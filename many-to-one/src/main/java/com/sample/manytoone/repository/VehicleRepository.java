package com.sample.manytoone.repository;

import com.sample.manytoone.model.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle,Long> {
}
