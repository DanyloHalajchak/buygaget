package ua.com.buygadget.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.buygadget.dao.ColorsDao;
import ua.com.buygadget.entity.Color;
import ua.com.buygadget.service.ColorService;
@Service
public class ColorServicelmpl implements ColorService{

	@Autowired
	ColorsDao colorsDao;
	
	public void save(Color color) {
		
		colorsDao.save(color);
	}

	public List<Color> getAll() {
		List<Color> colors = colorsDao.findAll();
		return colors;
	}

	public Color getForId(int id) {
		Color color = colorsDao.getOne(id);
		return color;
	}

	public void update(Color color) {
colorsDao.save(color);
		
	}

	public void delet(int id) {
		colorsDao.delete(id);
		
	}

}
