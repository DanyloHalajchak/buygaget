package ua.com.buygadget.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.buygadget.dao.BrendsDao;
import ua.com.buygadget.dao.CategoryDao;
import ua.com.buygadget.dao.GoodsDao;
import ua.com.buygadget.entity.Brend;
import ua.com.buygadget.entity.Category;
import ua.com.buygadget.entity.Goods;
import ua.com.buygadget.service.BrandService;
@Service
public class BrandServicelmpl implements BrandService{

	@Autowired
	private BrendsDao brendsDao;
	@Autowired
	private GoodsDao goodsDao;
	
	public void save(Brend brend) {
		
		brendsDao.save(brend);
	}

	public List<Brend> getAll() {
		List<Brend> brend = brendsDao.findAll();
		return brend;
	}

	public Brend getForId(int id) {
		Brend brend = brendsDao.getOne(id);
		return brend;
	}

	public void update(Brend brend) {
		brendsDao.save(brend);
		
	}

	public void delet(int id) {
		brendsDao.delete(id);
		
	}

	public void addBrendToGoods(int idGoods, int idBrend) {
		Goods goods = goodsDao.findOne(idGoods);
//		System.out.println(goods);
		Brend brend = brendsDao.findOne(idBrend);
//		System.out.println(brend);
//		brend.getGoods().add(goods);
		
		goods.setBrend(brend);
		goodsDao.save(goods);
		
	}

	


}
