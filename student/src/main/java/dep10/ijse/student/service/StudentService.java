package dep10.ijse.student.service;

import dep10.ijse.student.dto.StudentDTO;
import dep10.ijse.student.entity.Student;

import java.util.List;

public interface StudentService {

    void saveStudent(Student student);

    List<Student> findAllStudents();

    List<Student> findAllStudentsBySchoolId(Integer id);
}
