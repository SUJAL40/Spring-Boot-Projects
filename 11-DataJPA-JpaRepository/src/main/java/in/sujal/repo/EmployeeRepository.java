package in.sujal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import in.sujal.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Modifying
	@Transactional  // ✅ Required for update/delete queries
	@Query("UPDATE Employee e SET e.empSalary = :salary WHERE e.empId = :id")
	int updateEmployeeSalary(@Param("id") int id, @Param("salary") double salary);
	
	@Modifying
	@Transactional  // ✅ Required for update/delete queries
	@Query(value="delete from emp_tbl where emp_id = :id",nativeQuery = true)
	int deleteEmp(@Param("id") int id);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO emp_tbl (emp_id, dept, emp_gender, emp_name, emp_salary) VALUES (:emp_id, :dept, :emp_gender, :emp_name, :emp_salary)", nativeQuery = true)
	int insertEmpData(@Param("emp_id") int emp_id,
	                  @Param("dept") String dept,
	                  @Param("emp_gender") String empGender,
	                  @Param("emp_name") String empName,
	                  @Param("emp_salary") double empSalary);



}
