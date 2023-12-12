package dep10ijse.school.client;

import dep10ijse.school.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service",url = "${application.config.student_url}")
public interface StudentClient {

    @GetMapping("/school/{school_id}")
    List<Student> findAllStudentsBySchoolId(@PathVariable("school_id") Integer schoolId);



}
