package furama_resort.repositories.impl;

import furama_resort.models.person.Employee;
import furama_resort.repositories.IEmployeeRepository;
import furama_resort.utils.employee.EmployeeCSV;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private List<Employee> employeeList = new ArrayList<>();
    private EmployeeCSV employeeCSV = new EmployeeCSV();

    @Override
    public List<Employee> findAll() {
        return employeeCSV.readCSV();
    }

    @Override
    public void add(Employee employee) {
        if (!employeeCSV.readCSV().isEmpty()) {
            employeeList = employeeCSV.readCSV();
            employeeList.add(employee);
            String list = employeeCSV.convertListToStringCSV(employeeList);
            employeeCSV.writeListToCSV(list);
        } else {
            employeeList.add(employee);
            String list = employeeCSV.convertListToStringCSV(employeeList);
            employeeCSV.writeListToCSV(list);
        }
    }

    @Override
    public Employee findByCode(String inputCode) {
        employeeList = employeeCSV.readCSV();
        for (Employee employee : employeeList) {
            if (employee.getEmployeeCode().equals(inputCode)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void remove(String inputCode) {
        employeeList = employeeCSV.readCSV();
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).getEmployeeCode().equals(inputCode)){
                employeeList.remove(employeeList.get(i));
                break;
            }
        }
        String list = employeeCSV.convertListToStringCSV(employeeList);
        employeeCSV.writeListToCSV(list);
    }
}
