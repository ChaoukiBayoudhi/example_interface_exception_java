package Classes;

import interfeaces.IGroup;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class StudentGroupSet implements IGroup {
    private Set<Student> students=new HashSet<>();

    @Override
    public boolean addStudent(Student student) {
        return false;
    }

    @Override
    public boolean removeStudent(Student student) {
        return false;
    }

    @Override
    public Optional<Student> findStudent(int id) {
        return null;
    }

    @Override
    public void listStudents() {

    }

    @Override
    public boolean addMark(int id, double mark) {
        return false;
    }

    @Override
    public double calculateScore(int id) {
        return 0;
    }
}
