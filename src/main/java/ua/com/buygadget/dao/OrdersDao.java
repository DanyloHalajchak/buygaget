package ua.com.buygadget.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.buygadget.entity.Color;
import ua.com.buygadget.entity.Order;

public interface OrdersDao extends JpaRepository <Order, Integer>{

}
