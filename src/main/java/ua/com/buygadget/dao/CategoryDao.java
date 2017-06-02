package ua.com.buygadget.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.buygadget.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {

	
	
	
}
