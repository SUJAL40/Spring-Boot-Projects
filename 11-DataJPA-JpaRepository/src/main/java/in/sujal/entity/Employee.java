package in.sujal.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emp_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	private Integer empId;
	private String empName;
	private Double empSalary;
	private String empGender;
	private String dept;
	@Column(name="date_created",updatable = false) //-> updatable = false means when record updated create date should not modified
	@CreationTimestamp
	private LocalDate dateCreated;
	@UpdateTimestamp
	@Column(name="last_updated",insertable = false)
	private LocalDate lastUpdated;
	
}
