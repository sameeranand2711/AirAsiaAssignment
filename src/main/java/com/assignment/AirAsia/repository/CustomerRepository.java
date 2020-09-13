package com.assignment.AirAsia.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.assignment.AirAsia.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {


	@Query("select c from customer c where c.email = ?1")
	Customer findByEmail(String email);
}
