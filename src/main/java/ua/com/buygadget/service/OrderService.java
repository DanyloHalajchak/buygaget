package ua.com.buygadget.service;

import java.util.List;

import ua.com.buygadget.entity.Goods;
import ua.com.buygadget.entity.Order;

public interface OrderService {

	void save(Order order);

	List<Order> getAll();

	Order getForId(int id);

	void update(Order order);

	void delet(int id);

}
