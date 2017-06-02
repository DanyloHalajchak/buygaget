package ua.com.buygadget.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ua.com.buygadget.entity.Category;
import ua.com.buygadget.entity.Color;

@Repository
public interface ColorsDao extends JpaRepository <Color, Integer>{

	
	
}
