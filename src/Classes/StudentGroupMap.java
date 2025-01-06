package Classes;

import interfeaces.IGroup;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class StudentGroupMap implements IGroup {
    private Map<Integer,Student> students=new TreeMap<>();

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
