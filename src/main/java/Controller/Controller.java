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
    public int getId() {
        return employee.getId();
    }
    public void setId(int id) {
        this.employee.setId(id);
    }
    public String getNombre() {
        return employee.getName();
    }
    public void setNombre(String name) {
        this.employee.setName(name);
    }
    public String getApellido() {
        return employee.getSurname();
    }
    public void setApellido(String surname) {
        this.employee.setSurname(surname);
    }

    public String getAddress() {
        return employee.getAddress();
    }
    public void setAddress(String address) {
        this.employee.setAddress(address);
    }

    public int getAge() {
        return employee.getAge();
    }
    public void setAges(int age) {
        this.employee.setAge(age);
    }
}
