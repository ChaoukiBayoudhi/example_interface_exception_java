package interfeaces;

import Classes.Student;

import java.util.Optional;

public interface IGroup {
    boolean addStudent(Student student);
    boolean removeStudent(Student student);
    Optional<Student> findStudent(int id);
    void listStudents();
    boolean addMark(int id, double mark);
    double calculateScore(int id);
}
