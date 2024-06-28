package pe.edu.idat.app_ventas_idat.service;

import pe.edu.idat.app_ventas_idat.model.bd.Customer;
import pe.edu.idat.app_ventas_idat.repository.CustomerRepository;

import java.util.List;

public interface ICustomerService {
    List<Customer> listarCustomer();

    Customer guardarCustomer(Customer customer);
}
