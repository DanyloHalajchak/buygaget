package ua.com.buygadget.service;

import java.util.List;

import ua.com.buygadget.entity.Color;

public interface ColorService {

	void save(Color color);

	List<Color> getAll();

	Color getForId(int id);

	void update(Color color);

	void delet(int id);

}
