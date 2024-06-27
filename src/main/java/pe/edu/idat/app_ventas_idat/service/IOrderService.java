package pe.edu.idat.app_ventas_idat.service;

import pe.edu.idat.app_ventas_idat.model.bd.Order;

import java.util.List;

public interface IOrderService {
    List<Order> listarOrdenes();
    Order guardarOrdenes(Order order);
}
