package ua.com.buygadget.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ua.com.buygadget.dao.UsersDao;
import ua.com.buygadget.entity.Tag;
import ua.com.buygadget.entity.User;
import ua.com.buygadget.service.UsersService;
import ua.com.buygadget.validation.Validator;
import ua.com.buygadget.validation.goods.GoodsExeption;
import ua.com.buygadget.validation.user.UserExeption;

@Service
public class UsersServicelmpl implements UsersService{

	
	@Autowired
	private UsersDao UsersDao;
	@Autowired
	@Qualifier("userValidator")
	Validator validator;

	public void save(User user) throws UserExeption, GoodsExeption {
		validator.validate(user);
		UsersDao.save(user);
	}

	public List<User> getAll() {
		List<User> user = UsersDao.findAll();
		return user;
	}

	public User getForId(int id) {
		User user = UsersDao.getOne(id);
		return user;
	}

	public void update(User user) {
		UsersDao.save(user);
		
	}

	public void delet(int id) {
		UsersDao.delete(id);
		
	}
	
}
