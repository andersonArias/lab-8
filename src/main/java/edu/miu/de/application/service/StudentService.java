package edu.miu.de.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.de.application.domain.Student;
import edu.miu.de.application.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	public StudentRepository studentRepository;

	public List<Student> getStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student getStudentById(Integer id) {
		return studentRepository.findById(id).orElse(null);
	}
	
	public List<Student> getStudentByNumber(String number) {
		return studentRepository.getStudentByNumber(number);
	}

	public void deleteStudentById(Integer studentId) {
		studentRepository.deleteById(studentId);
	}

}