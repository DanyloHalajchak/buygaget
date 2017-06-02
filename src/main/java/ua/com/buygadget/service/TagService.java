package ua.com.buygadget.service;

import java.util.List;

import ua.com.buygadget.entity.Post;
import ua.com.buygadget.entity.Tag;

public interface TagService {

	void save(Tag tag);

	List<Tag> getAll();

	Tag getForId(int id);

	void update(Tag tag);

	void delet(int id);

}
