package ua.com.buygadget.service;

import java.util.List;

import ua.com.buygadget.entity.Tag;
import ua.com.buygadget.entity.User;
import ua.com.buygadget.validation.goods.GoodsExeption;
import ua.com.buygadget.validation.user.UserExeption;

public interface UsersService {

	void save(User user) throws UserExeption, GoodsExeption;

	List<User> getAll();

	User getForId(int id);

	void update(User user);

	void delet(int id);

}
