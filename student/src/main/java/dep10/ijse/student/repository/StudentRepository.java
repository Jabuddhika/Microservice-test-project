package dep10.ijse.student.repository;

import dep10.ijse.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findAllBySchoolId(Integer id);
}
