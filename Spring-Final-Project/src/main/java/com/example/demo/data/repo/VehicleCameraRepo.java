package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.data.VehicleCamera;

@Repository
public interface VehicleCameraRepo extends JpaRepository<VehicleCamera, Integer> {

	@Query(value = "SELECT * FROM vehicle_camera WHERE vehicle_registration_number IN (SELECT vehicle_registration_number FROM vehicle WHERE vehicle_id IN (select vehicle_id from person_vehicle where person_id=:personId)) ORDER BY timestamp DESC", nativeQuery = true)
	List<VehicleCamera> getVehicleCameraByPersonId(@Param("personId") Long personId);

}
