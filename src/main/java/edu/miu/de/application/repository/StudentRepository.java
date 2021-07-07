package edu.miu.de.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import edu.miu.de.application.domain.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	@Query("select s from Student s where number = ?1")
	public List<Student> getStudentByNumber(String number);

}
