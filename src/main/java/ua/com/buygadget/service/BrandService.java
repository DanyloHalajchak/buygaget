package ua.com.buygadget.service;

import java.util.List;

import ua.com.buygadget.entity.Brend;
import ua.com.buygadget.entity.Category;

public interface BrandService {

	void save(Brend brend);

	List<Brend> getAll();

	Brend getForId(int id);

	void update(Brend brend);

	void delet(int id);

	void addBrendToGoods(int idGoods, int idBrend);

}
