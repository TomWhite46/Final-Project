package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.data.WaypointRecord;

@Repository
public interface WaypointRecordRepo extends JpaRepository<WaypointRecord, Integer> {

	@Query(value = "select * from waypoint_record where person_id = :personId ORDER BY timestamp DESC", nativeQuery = true)
	List<WaypointRecord> getByPersonIDOrderByTimestamp(@Param("personId") Long personId);

}
