package furama_resort.controllers;

import furama_resort.models.person.Employee;
import furama_resort.services.IEmployeeService;
import furama_resort.services.impl.EmployeeService;

import java.util.List;

public class EmployeeController {
    private IEmployeeService employeeService = new EmployeeService();

    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    public void add(Employee newEmployee) {
        employeeService.add(newEmployee);
    }

    public Employee findByCode(String inputCode) {
        return employeeService.findByCode(inputCode);
    }

    public void remove(String inputCode) {
        employeeService.remove(inputCode);
    }
}
