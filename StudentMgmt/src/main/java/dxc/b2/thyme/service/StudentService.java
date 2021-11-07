 package dxc.b2.thyme.service;

import java.util.List;

import dxc.b2.thyme.model.Student;






public interface StudentService {
    List < Student > getAllEmployees();
    void saveEmployee(Student employee);
    Student getstudentById(long id);
    void deleteStudentById(long id);
	void saveStudent(Student student);
	Object getAllStudents();
	Student getStudentById(long id);
}