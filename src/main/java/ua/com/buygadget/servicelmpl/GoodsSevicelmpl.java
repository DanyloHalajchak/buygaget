package ua.com.buygadget.servicelmpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ua.com.buygadget.dao.BrendsDao;
import ua.com.buygadget.dao.CategoryDao;
import ua.com.buygadget.dao.ColorsDao;
import ua.com.buygadget.dao.GoodsDao;
import ua.com.buygadget.entity.Brend;
import ua.com.buygadget.entity.Category;
import ua.com.buygadget.entity.Color;
import ua.com.buygadget.entity.Goods;
import ua.com.buygadget.service.GoodsService;
import ua.com.buygadget.validation.Validator;
import ua.com.buygadget.validation.goods.GoodsExeption;
import ua.com.buygadget.validation.user.UserExeption;

@Service
public class GoodsSevicelmpl implements GoodsService{

	
	@Autowired
	private GoodsDao goodsDao;
	@Autowired
	private BrendsDao brendsDao;
	@Autowired
	ColorsDao colorsDao;
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	@Qualifier("goodsValidator")
	Validator validator;

	public void save(Goods goods) throws GoodsExeption, UserExeption {
		validator.validate(goods);
//		Brend brend = brendsDao.getOne(brendId);
//		Color color = colorsDao.getOne(colorId);
//		Category category = categoryDao.getOne(categoryId);
//	goodsDao.saveAndFlush(goods);
//		goods.setBrend(brend);
//		goods.setColor(color);
//		goods.setCategory(category);
		goodsDao.save(goods);
	}

	public List<Goods> getAll() {
		List<Goods> goods = goodsDao.findAll();
		return goods;
	}

	public Goods getForId(int id) {
		return goodsDao.findOne(id);

	}

	public void update(Goods goods) {
		goodsDao.save(goods);
		
	}

	public void delet(int id) {
		goodsDao.delete(id);
		
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
