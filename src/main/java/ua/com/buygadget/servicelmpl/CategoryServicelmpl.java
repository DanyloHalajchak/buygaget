package ua.com.buygadget.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.buygadget.dao.CategoryDao;
import ua.com.buygadget.dao.ColorsDao;
import ua.com.buygadget.entity.Category;
import ua.com.buygadget.entity.Color;
import ua.com.buygadget.service.CategoryService;
@Service
public class CategoryServicelmpl implements CategoryService{

	@Autowired
	CategoryDao categoryDao;
	
	public void save(Category category) {
		
		categoryDao.save(category);
	}

	public List<Category> getAll() {
		List<Category> category = categoryDao.findAll();
		return category;
	}

	public Category getForId(int id) {
		Category category = categoryDao.getOne(id);
		return category;
	}

	public void update(Category category) {
		categoryDao.save(category);
		
	}

	public void delet(int id) {
		categoryDao.delete(id);
		
	}

	
	
	
}
