package ua.com.buygadget.dao;

import java.util.List;

import ua.com.buygadget.entity.Category;

public interface GenericDao<T> {

	void add(T t);
	List<T> getAll();
	T getForId(int id);
	void update(T t);
	void delet(int id);
	
}
