package org.HW.maps;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    Employee addNewEmployee(String firstName, String lastName);
    Employee removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    Map<String, Employee> printAllEmployees();
}