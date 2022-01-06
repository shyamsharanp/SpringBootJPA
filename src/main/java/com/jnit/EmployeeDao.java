package com.jnit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao
        extends JpaRepository<Employee, Long> {
 
}
