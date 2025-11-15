package in.sujal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sujal.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
