package lexicon.se.service;
import lexicon.se.data_access.StudentDao;
import lexicon.se.models.Student;
import lexicon.se.util.UserInputService;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementConsoleImpl implements StudentManagement{

    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public Student remove(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student edit(Student student) {
        return null;
    }

    UserInputService scannerService;

    StudentDao studentDao;
}
