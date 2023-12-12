package dep10ijse.school.dto;

import dep10ijse.school.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FullSchoolResponse {

    private String name;

    private String email;

    private List<Student> studentList;
}
