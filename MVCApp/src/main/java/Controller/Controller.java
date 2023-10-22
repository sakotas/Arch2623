package Controller;

import Controller.Interfaces.IGetModel;
import Controller.Interfaces.IGetView;
import Model.Domain.Student;
import Model.Model;
import View.View;

import java.util.List;

public class Controller {
    private IGetModel model;
    private IGetView view;
    private List<Student> students;

    public Controller(IGetModel model, IGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> studs) {
        if (studs.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        //MVP
        students = model.getAllStudents();

        if (testData(students)) {
            view.printAllStudent(students);
        } else {
            System.out.println("Список студентов пуст!");
        }

        //MVC
        // view.printAllStudent(model.getAllStudents());
    }

}
