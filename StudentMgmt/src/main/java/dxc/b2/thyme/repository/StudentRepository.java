package dxc.b2.thyme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dxc.b2.thyme.model.Student;




@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}