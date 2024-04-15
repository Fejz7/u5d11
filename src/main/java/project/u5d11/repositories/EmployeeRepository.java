package project.u5d11.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.u5d11.entities.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
