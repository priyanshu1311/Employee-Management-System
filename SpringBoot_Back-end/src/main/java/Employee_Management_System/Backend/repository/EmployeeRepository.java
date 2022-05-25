package Employee_Management_System.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Employee_Management_System.Backend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
	
}
