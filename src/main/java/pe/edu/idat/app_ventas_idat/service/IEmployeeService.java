package pe.edu.idat.app_ventas_idat.service;

import pe.edu.idat.app_ventas_idat.model.bd.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> listarEmpleados();
    Employee guardarEmpleados(Employee employee);
}
