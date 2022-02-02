package sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sms.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
