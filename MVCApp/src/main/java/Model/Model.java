package Model;

import java.util.List;

import Controller.Interfaces.IGetModel;
import Model.Domain.Student;

public class Model implements IGetModel {

    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
