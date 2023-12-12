package dep10.ijse.student.api;

import dep10.ijse.student.entity.Student;
import dep10.ijse.student.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student){
        service.saveStudent(student);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Student> findAllStudents(){
        return service.findAllStudents();

    }
}
