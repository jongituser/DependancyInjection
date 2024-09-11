package lexicon.se.data_access;
import lexicon.se.models.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao{
    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
