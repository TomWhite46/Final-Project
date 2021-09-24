package com.example.demo.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.BusinessAddress;

public interface BusinessAddressRepo extends JpaRepository<BusinessAddress, Integer> {

}
