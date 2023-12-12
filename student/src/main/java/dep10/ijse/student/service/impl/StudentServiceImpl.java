package dep10.ijse.student.service.impl;

import dep10.ijse.student.entity.Student;
import dep10.ijse.student.repository.StudentRepository;
import dep10.ijse.student.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveStudent(Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
       return repository.findAll();
    }

    @Override
    public List<Student> findAllStudentsBySchoolId(Integer id) {
        return repository.findAllBySchoolId(id);
    }
}
