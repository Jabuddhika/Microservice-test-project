package dep10ijse.school.api;

import dep10ijse.school.entity.School;
import dep10ijse.school.service.SchoolService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/schools")
public class SchoolController {

    private final SchoolService service;

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
}
