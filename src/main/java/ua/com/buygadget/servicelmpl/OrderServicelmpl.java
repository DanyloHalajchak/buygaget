package ua.com.buygadget.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.buygadget.dao.OrdersDao;
import ua.com.buygadget.entity.Order;
import ua.com.buygadget.service.OrderService;
@Service
public class OrderServicelmpl implements OrderService{

	@Autowired
	private OrdersDao ordersDao;
	
	public void save(Order order) {
		
		ordersDao.save(order);
	}

	public List<Order> getAll() {
		List<Order> order = ordersDao.findAll();
		return order;
	}

	public Order getForId(int id) {
		Order order = ordersDao.getOne(id);
		return order;
	}

	public void update(Order order) {
		ordersDao.save(order);
		
	}

	public void delet(int id) {
		ordersDao.delete(id);
		
	}
	
}
