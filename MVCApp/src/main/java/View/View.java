package View;

import Controller.Interfaces.IGetView;
import Model.Domain.Student;

import java.util.List;

public class View implements IGetView {

    public void printAllStudent(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }

}
