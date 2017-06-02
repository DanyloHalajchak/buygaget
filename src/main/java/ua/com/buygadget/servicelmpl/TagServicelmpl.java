package ua.com.buygadget.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.buygadget.dao.TagsDao;
import ua.com.buygadget.entity.Tag;
import ua.com.buygadget.service.TagService;

@Service
public class TagServicelmpl implements TagService{

	@Autowired
	private TagsDao tagsDao;
	
	public void save(Tag tag) {
		
		tagsDao.save(tag);
	}

	public List<Tag> getAll() {
		List<Tag> tag = tagsDao.findAll();
		return tag;
	}

	public Tag getForId(int id) {
		Tag tag = tagsDao.getOne(id);
		return tag;
	}

	public void update(Tag tag) {
		tagsDao.save(tag);
		
	}

	public void delet(int id) {
		tagsDao.delete(id);
		
	}
	
}
