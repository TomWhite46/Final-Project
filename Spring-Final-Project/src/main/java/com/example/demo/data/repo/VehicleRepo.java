package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Vehicle;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {
	@Query(value = "SELECT * FROM vehicle WHERE vehicle_id IN (select vehicle_id from person_vehicle where person_id = :personId)", nativeQuery = true)
	List<Vehicle> getVehicleByPersonId(@Param("personId") long personId);
}
