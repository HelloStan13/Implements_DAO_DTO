package Controller;

import Model.Employee;
import View.EmployeeView;

public class Controller {
    private Employee employee;
    private EmployeeView employeeView;


    public Controller(Employee employee, EmployeeView employeeView) {
        this.employee = employee;
        this.employeeView = employeeView;
    }
}
