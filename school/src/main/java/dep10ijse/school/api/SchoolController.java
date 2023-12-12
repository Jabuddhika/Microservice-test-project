package dep10ijse.school.api;

import dep10ijse.school.client.StudentClient;
import dep10ijse.school.dto.FullSchoolResponse;
import dep10ijse.school.entity.School;
import dep10ijse.school.entity.Student;
import dep10ijse.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/schools")
public class SchoolController {

    private final SchoolService service;

    @Autowired
    private StudentClient client;

    public SchoolController(SchoolService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody School school){
        service.saveSchool(school);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<School> findAllStudents(){
        return service.findAllSchools();

    }

    @GetMapping("/with-students/{school_id}")
    private List<FullSchoolResponse> findSchoolWithStudents(@PathVariable("school_id") Integer schoolId){
       School school= service.findById(schoolId).orElse(School.builder().name("NOT_FOUND").email("NOT_FOUND").build());
        List<Student> studentList = client.findAllStudentsBySchoolId(schoolId);

        return Collections.singletonList(FullSchoolResponse.builder().
                name(school.getName()).email(school.getEmail()).studentList(studentList).build());

    }
}
