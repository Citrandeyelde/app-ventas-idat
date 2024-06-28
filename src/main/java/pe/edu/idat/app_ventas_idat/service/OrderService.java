package pe.edu.idat.app_ventas_idat.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.app_ventas_idat.model.bd.Category;
import pe.edu.idat.app_ventas_idat.model.bd.Order;
import pe.edu.idat.app_ventas_idat.repository.OrderRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class OrderService implements IOrderService{
    private OrderRepository orderRepository;
    @Override
    public List<Order> listarOrdenes(){return orderRepository.findAll();}

    @Override
    public Order guardarOrdenes(Order order) {
        return orderRepository.save(order);
    }
}
