package furama_resort.repositories;

import furama_resort.models.person.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository{
    List<Employee> findAll();

    void add(Employee employee);

    Employee findByCode(String inputCode);

    void remove(String inputCode);
}
