package dep10.ijse.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO implements Serializable {

    private String firstName;

    private String lastName;

    private String gmail;

    private Integer schoolId;
}
