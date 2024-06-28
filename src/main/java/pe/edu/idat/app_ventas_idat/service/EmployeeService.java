package pe.edu.idat.app_ventas_idat.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.app_ventas_idat.model.bd.Employee;
import pe.edu.idat.app_ventas_idat.repository.EmployeeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService implements  IEmployeeService{
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> listarEmpleados(){ return employeeRepository.findAll();}
    @Override
    public Employee guardarEmpleados(Employee employee) {
        return employeeRepository.save(employee);
    }

}
