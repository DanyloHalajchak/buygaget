package ua.com.buygadget.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ua.com.buygadget.entity.Brend;
import ua.com.buygadget.entity.Goods;

public interface BrendsDao extends JpaRepository<Brend, Integer>{

	@Query("select o from Brend o left join fetch o.goods       where o.id =:value")
	Brend findBrendsWithGoods(@Param("value") int value);
	
}
