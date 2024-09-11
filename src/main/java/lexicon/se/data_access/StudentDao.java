package lexicon.se.data_access;

import lexicon.se.models.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao
{
Student save(Student student);
Student find(int id);
List<Student> findAll();
void delete(int id);
}
