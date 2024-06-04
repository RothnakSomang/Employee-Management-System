/**
 * 
 */
package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Employee;

/**
 * @author ksgusr
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
