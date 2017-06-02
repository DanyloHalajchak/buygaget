package ua.com.buygadget.service;

import java.util.List;

import ua.com.buygadget.entity.Color;
import ua.com.buygadget.entity.Goods;
import ua.com.buygadget.validation.goods.GoodsExeption;
import ua.com.buygadget.validation.user.UserExeption;

public interface GoodsService {

	void save(Goods goods) throws GoodsExeption, UserExeption;

	List<Goods> getAll();

	Goods getForId(int id);

	void update(Goods goods);

	void delet(int id);

	void addBrendToGoods(int idGoods, int idBrend);

}
