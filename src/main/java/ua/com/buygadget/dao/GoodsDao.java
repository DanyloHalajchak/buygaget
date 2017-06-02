package ua.com.buygadget.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;
import ua.com.buygadget.entity.Category;
import ua.com.buygadget.entity.Color;
import ua.com.buygadget.entity.Goods;

@Repository
public interface GoodsDao extends JpaRepository <Goods, Integer>{

	
	
}
