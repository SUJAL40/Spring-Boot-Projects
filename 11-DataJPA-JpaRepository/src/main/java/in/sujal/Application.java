package in.sujal;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.context.ConfigurableApplicationContext;

import in.sujal.entity.Employee;
import in.sujal.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		System.out.println(repository.getClass().getName());
//		Employee e1 = new Employee(1,"John",5000.00,"Male","Sales");
//		repository.save(e1);
//		Employee e2 = new Employee(2,"Don",40000.00,"Male","HR");
//		Employee e3 = new Employee(3,"Sakshi",100000.00,"Female","Designer");
//		Employee e4 = new Employee(4,"Sujal",45000.00,"Male","Developer");		
//		Employee e5 = new Employee(5,"Shweta",85000.00,"Female","HR");		
//		repository.saveAll(Arrays.asList(e2,e3,e4,e5));
//		
//		System.out.println("Record Saved Successfully.....");
		
		//***** Sorting based on Employee Name
		
		// 1. Create a Sort object
//		Sort sort = Sort.by("empName").ascending();
//
//		// 2. Use the findAll(Sort) method
//		Iterable<Employee> sortedEmployees = repository.findAll(sort);
//
//		// 3. Print the sorted results
//		sortedEmployees.forEach(System.out::println);
		
		
		//sorting based on multiple column
		
//		Sort sort = Sort.by("empName","empSalary").descending();
		
		
		// ---------- PAGINATION EXAMPLE ----------

//        int pageNo = 1; // Page number to fetch (user-friendly page count)
        // Create a PageRequest: (page index starts from 0, 3 records per page)
//        PageRequest page = PageRequest.of(pageNo - 1, 3);
//        
        // Fetch only the specified page of Employee records from the repository
//        Page<Employee> findAll = repository.findAll(page);
//        
        // Extract the actual list of Employee objects from the Page result
//        List<Employee> emps = findAll.getContent();
//        
        // Print all employees from the selected page
//        emps.forEach(System.out::println);


        // ---------- QUERY BY EXAMPLE (QBE) EXAMPLE ----------

        // Create an Employee object to use as a filter for the query
//        Employee emp = new Employee();
//        emp.setEmpGender("Male"); // Set the field to match in the database
        
        // Create an Example object based on the filter Employee
//        Example<Employee> example = Example.of(emp);
        
        // Fetch all employees that match the given example (where gender = "Male")
//        List<Employee> matchedEmps = repository.findAll(example);
        
        // Print all matching employees
//        matchedEmps.forEach(System.out::println);
		
		//Assignment-lecture No.18
		
		//update record in table using custom query
//		repository.updateEmployeeSalary(3, 50_000);
//		System.out.println("Salary updated successfully!");
		
		//delete record in table using custom query
//		repository.deleteEmp(5);
//		System.out.println("Employee deleted successfully!");
		
		//insert record in table using custom query
//		repository.insertEmpData(5, "Business ", "Male", "Ajinkya",25_000);
//		System.out.println("New Employee Added Succesfully.....");
		
		//TimeStamping in JPA
		
	    Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Raja");
		emp.setDept("HR");
		emp.setEmpGender("Male");
		repository.save(emp);
		
		
		
		
		
		
		
		
		
		
		
	}

}
