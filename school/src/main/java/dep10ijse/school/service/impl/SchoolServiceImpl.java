package dep10ijse.school.service.impl;

import dep10ijse.school.entity.School;
import dep10ijse.school.repository.SchoolRepository;
import dep10ijse.school.service.SchoolService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository repository;

    public SchoolServiceImpl(SchoolRepository repository) {
        this.repository = repository;
    }


    @Override
    public void saveSchool(School school) {
        repository.save(school);
    }

    @Override
    public List<School> findAllSchools() {
        return repository.findAll();
    }

    @Override
    public Optional<School> findById(Integer id) {
        return repository.findById(id);
    }
}
