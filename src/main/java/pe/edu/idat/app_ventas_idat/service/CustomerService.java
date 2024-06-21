package pe.edu.idat.app_ventas_idat.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.app_ventas_idat.model.bd.Customer;
import pe.edu.idat.app_ventas_idat.repository.CustomerRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class CustomerService implements ICustomerService {
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> listarCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer guardarCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
