package Classes;

import interfeaces.IGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//class A extends B (ok)
//class A extends B, C (Error)
//class A implements I1, I2, I3, I4 (a class could implement many interfaces)
//interface I1 extends I2
public class StudentGroupList implements IGroup {
    private List<Student> students=new ArrayList<>();


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
        Student student =new Student();
        student.setId(id);
        int index = students.indexOf(student);
        Optional<Student> result=Optional.empty();
        if(index !=-1)
            result=Optional.of(students.get(index));
        return result;
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
