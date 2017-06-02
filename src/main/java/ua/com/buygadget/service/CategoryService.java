package ua.com.buygadget.service;

import java.util.List;

import ua.com.buygadget.entity.Category;

public interface CategoryService {

	void save(Category category);

	List<Category> getAll();

	Category getForId(int id);

	void update(Category category);

	void delet(int id);

}
