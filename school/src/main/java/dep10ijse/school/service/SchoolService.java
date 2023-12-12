package dep10ijse.school.service;


import dep10ijse.school.entity.School;

import java.util.List;
import java.util.Optional;

public interface SchoolService {

    void saveSchool(School school);

    List<School> findAllSchools();

    Optional<School> findById(Integer id);
}
